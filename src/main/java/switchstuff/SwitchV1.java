package switchstuff;

public class SwitchV1 {
  public static void main(String[] args) {
    int x = 4;
    // "argument" must be in parens, and must be
    // int or smaller numeric type (primitive)
    // String, or an enum (enumeration) type -- since Java 5
    switch (x) {
      case 1:
        System.out.println("x is one");
        System.out.println("C'est a dire un!");
      // case amounts to "in the case that it's this value, jump here
      case 2:
        System.out.println("two");
        break;
      case 3:
        int thing = 99;
        System.out.println("three");
        break;
      default:
// YIKES, thing from above is in scope
//        int thing = 22;
        System.out.println("six or more");
        break;
      case 4:
      case 5:
        System.out.println("four or five");
        break;
    } // statement, doesn't end with semicolon
    ;;;;; // null statements :)
  }
}
