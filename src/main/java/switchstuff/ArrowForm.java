package switchstuff;

import java.sql.SQLOutput;

public class ArrowForm {
  public static void main(String[] args) {
    // LTS 17 feature
    int x = 3;
    switch (x) {
      // comma separated alternation ALSO available for colon form
      case 1, 2, 3 -> {
        // curlies here mandatory for multiple
        // statements subordinate to arrow
        // side effect that variable scope is "sensible"
        System.out.println("small integer");
        if (Math.random() > 0.5) break;
        System.out.println("i.e. less than four");
      }
      case 4, 5, 6 -> System.out.println("medium");
//      case 7 -> break; // NOPE
      case 7 -> {} // if you really want to do this :)
      default -> System.out.println("larger int");
    }

    var var = 1 | 2 | 3; // bitwise operator 0001 0010 0011 -> 0011
    System.out.println(var);
  }
}
