package usinglambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UseAStudent {

  public static <E> List<E> filter(List<E> input, Predicate<E> test) {
    List<E> res = new ArrayList<>();
    for (E e : input) {
      if (test.test(e)) {
        res.add(e);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    List<Student> school = List.of(
      Student.of("Fred", 3.2, "Math", "Physics"),
      Student.of("Jim", 2.2, "Journalism"),
      Student.of("Sheila", 3.9, "Math", "Physics", "Astrophysics", "Quantum mechanics")
    );

    System.out.println("all:");
    System.out.println(school);
    System.out.println("smart:");
    System.out.println(filter(school, s -> s.getGpa() > 3.0));
    System.out.println("-----------------");
    school.stream()
      .filter(s -> s.getGpa() > 3.0)
      .map(s -> "Student with name " + s.getName() + " takes " + s.getGpa() + " courses")
//      .forEach(s -> System.out.println(s));
      .forEach(System.out::println); // "Method reference"
  }
}
