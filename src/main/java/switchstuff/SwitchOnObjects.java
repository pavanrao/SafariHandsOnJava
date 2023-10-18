package switchstuff;

public class SwitchOnObjects {
  public static void main(String[] args) {
//    Object obj = "Hello";
    Object obj = null;
    switch (obj) {
      case null -> System.out.println("There's nothing there!");
      case String s when s.length() > 3 ->
        System.out.println("it's a greeting more than three chars: " + s);
      case String s when s.length() > 4 ->
        System.out.println("it's greater than four chars");
      case String s -> System.out.println("it's a string not 3 chars");
      default -> System.out.println("something else");
    }
  }
}
