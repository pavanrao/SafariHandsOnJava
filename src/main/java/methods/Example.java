package methods;

public class Example {
  public static void addOne(int [] a) {
// would cause a local change, does not change caller's array
//    a = new int[]{101};
    System.out.println("a before: " + a[0]);
    a[0]++;
    System.out.println("a after: " + a[0]);
  }

  public static void addOne(int a) {
    System.out.println("a before: " + a);
    a++;
    System.out.println("a after: " + a);
  }

  // do NOT have: default values for params, nor named argument passing
  public static int add(int a, int b) {
    return a + b;
  }

  public static int add(int a, int b, int c) {
    return a + b + c;
  }

//  public static int add(int [] vals) { // ... receives an array
  public static int add(int ... vals) { // ... receives an array
    int sum = 0;
    for (int v : vals) {
      sum += v;
    }
    return sum;
  }

  public static long add(int a, long b) {
    return a + b;
  }

  public static long add(long a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    System.out.println("sum of 1 and 2 is " + add(1, 2));

//    1 + 2; // "traditional" expression, must use value...
    // "statement expression", do not have to use value
    // compiler allows use of this because it might have side effects
    // because of this, differentiating functions solely by their
    // return type "doesn't work"--IN THE SOURCE LANGUAGE Java.
    add(1,2);

    int [] ia = {
      1,
      2,
      3,
      4,
      5,
      6,
      7,
      8,
      9,
      10, // trailing comma permitted :)
    };
//    System.out.println(add({1,2,3,4,5,6,7,8,9,10})); // cannot use short form array decl here
    System.out.println(add(new int[]{1,2,3,4,5,6,7,8,9,10,})); // this is ok
    System.out.println(add(ia));

    // this is ok ONLY for ... in the called target
    System.out.println(add(new int[]{1,2,3,4,5,6,7,8,9,10}));
    System.out.println(add(1,2,3,4,5,6,7,8,9,10));

    int x = 99;
    System.out.println("x before: " + x);
    addOne(x);
    System.out.println("x after: " + x);
    System.out.println("array version -------------------------");
    int [] xa = {99};
    System.out.println("xa[0] before: " + xa[0]);
    addOne(xa);
    System.out.println("xa[0] after: " + xa[0]);
  }
}
