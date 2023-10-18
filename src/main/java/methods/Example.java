package methods;

public class Example {
  // do NOT have: default values for params, nor named argument passing
  public static int add(int a, int b) {
    return a + b;
  }

  public static int add(int a, int b, int c) {
    return a + b + c;
  }

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
  }
}
