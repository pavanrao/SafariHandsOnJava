package exceptions;

public class SimpleExample {
  public static void main(String[] args) {
//    new Thread(() -> {while(true);}).start();
    int [] ia = {1};
    System.out.println(ia[0]);
    try {
      System.out.println(ia[1]);
      System.out.println("never gets here?");
//    } catch (ArrayIndexOutOfBoundsException aie) {
    } catch (RuntimeException aie) {
      System.out.println("oops! message is " + aie.getMessage());
      System.out.println("got a " + aie.getClass().getName());
    }
    System.out.println("Continuing!");
  }
}
