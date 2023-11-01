package switchstuff;

public class ExpressionSwitch {
  public static void main(String[] args) {
    boolean enFrancais = true;

    int x = 2;
    String message = switch (x) {
      case 1 -> "The value is one!";
      case 2 -> "C'est deux!";
      default -> "something else!";
    };

//    String return = "bad";
    var yield = "Good";
//    int goto = 99;
//    int assert = 100;
    var var = "var";

    System.out.println("-----------------");
    // must cover all possible input values
    System.out.println(switch (x) {
      case 1 -> {
        System.out.println("I found a one... ");
        if (enFrancais) yield "C'est un";
        else yield "The value is one!"; // expressions with colon MUST use yield
      }
      case 2 -> "C'est deux!";
      case 3 -> throw new IllegalArgumentException("Three is not allowed!");
      default -> "something else!"; // int switch type demands default
    });
  }
}

//class var {} //
