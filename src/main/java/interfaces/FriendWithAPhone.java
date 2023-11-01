package interfaces;

public class FriendWithAPhone implements Photographer {
  {
    System.out.println("Instantiating FriendWithAPhone");
  }
  @Override
  public String takePhoto(String subject) {
    return "10 modest photos of " + subject;
  }
}
