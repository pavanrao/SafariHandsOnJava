package supplythis;

import notforpublicuse.MySecret;

public class MySupplier {
  private static String privateMessage = "This is private!!!";
  public static String message = "Message from MySupplier";
  public static void showSecretMessage() {
    System.out.println("I have read the message " + MySecret.internalMessage);
  }
}
