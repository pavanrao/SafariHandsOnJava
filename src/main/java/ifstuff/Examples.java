package ifstuff;

public class Examples {
  public static void main(String[] args) {
    int x = (int) (Math.random() * 10);
    System.out.println("x is " + x);
//    if (x > 5)
//      System.out.println("It's big");
//      System.out.println("nope");
// NO NO NO, ALWAYS use curlies, even for single subordinate statement


    if (x > 5) {
      System.out.println("It's big");
      System.out.println("yup");
    }
//    else if (x > 2) {
//      System.out.println("not tiny");
//    } else {
//      System.out.println("pretty darn small");
//    }
  }
}
