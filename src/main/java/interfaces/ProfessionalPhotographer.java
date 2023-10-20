package interfaces;

public class ProfessionalPhotographer implements Photographer {
  @Override
  public String takePhoto(String subject) {
    System.out.println("set up lights, create nice background, smile");
    System.out.println("click");
    System.out.println("Here's my bill:");
    return "Lovely print of " + subject;
  }

  public int getBill() {
    return FAIR_MARKET;
  }
}
