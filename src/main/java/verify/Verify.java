package verify;

public class Verify {
  public static void main(String[] args) {
    Object obj = "Hello";
    System.out.println(switch (obj) {
      case String s when s.length() > 3 -> obj + " Java 21 world!";
      default -> throw new RuntimeException("That can't happen!");
    });
  }
}
