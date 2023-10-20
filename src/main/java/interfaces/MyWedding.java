package interfaces;

import java.util.List;

public class MyWedding {
  public static void main(String[] args) {
    List<String> subjects = List.of(
      "Aunt"
    );
    List<Photographer> candidates = List.of(
      new ProfessionalPhotographer(),
      new FriendWithAPhone()
    );
    System.out.println(candidates.size());

    for (Photographer p : candidates) {
      for (String subject : subjects) {
        System.out.println(p.takePhoto(subject));
      }
    }
  }
}
