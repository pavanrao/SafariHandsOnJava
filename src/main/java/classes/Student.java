package classes;

import java.util.ArrayList;
import java.util.List;

public final class Student {

  public static class Builder {
    private String name;
    private double gpa;
    private List<String> courses = new ArrayList<>();

    private Builder() {
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder gpa(double gpa) {
      if (gpa < 0 || gpa > 5.0) {
        throw new IllegalArgumentException("Bad gpa value");
      }
      this.gpa = gpa;
      return this;
    }

    public Builder course(String course) {
      this.courses.add(course);
      return this;
    }

    public Student build() {
      // validate -- Student prefix could disambiguate if there's isValid
      // in both this and the enclosing class, but with only the enclosing one
      // it's unnecessary
      if (!Student.isValid(name, gpa, courses)) {
        throw new IllegalArgumentException("Bad values for Student");
      }
      return new Student(name, gpa, new ArrayList(courses));
    }

//    private boolean isValid(String name, double gpa, List<String> courses) {
//      return false;
//    }
  }

  private String name;
  private double gpa;
  private List<String> courses;

  private Student(String name, double gpa, List<String> courses) {
    this.name = name;
    this.gpa = gpa;
    this.courses = courses;
  }

  public static Builder builder() {
    return new Builder();
  }

//  public static Student ofNameParent(String name, String parent) { return null; }
//  public static Student ofNameBankName(String name, String bank) { return null; }
  public static Student of(String name, double gpa, String... courses) {
    // validate!!!
    return new Student(name, gpa, List.of(courses));
  }

  private static boolean isValid(String name, double gpa, List<String> courses) {
    return name != null && name.length() > 0
      && gpa >= 0 && gpa <= 5.0
      && courses != null;
  }

  @Override
  public String toString() {
    return "Student{" +
      "name='" + name + '\'' +
      ", gpa=" + gpa +
      ", courses=" + courses +
      '}';
  }
}

class UseAStudent {
  public static void main(String[] args) {
    Student.Builder sb = Student.builder() // builder will be "template/scratchpad" for initialization
      .name("Simon")
      .gpa(2.1)
      .course("Math")
      .course("Physics");
    Student s1 = sb.build();
    Student s2 = sb.name("Alex").course("Quantum Mechanics").build();
    System.out.println("s1 is " + s1);
    System.out.println("s2 is " + s2);
  }
}
