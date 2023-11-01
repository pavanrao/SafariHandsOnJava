package loops;

import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;

public class While {
  public static void main(String[] args) {
    int x = 3;
    while (x > 0) {
      System.out.println("x is " + x);
//      x -= 1;
      x--;
//      x = x - 1;
    }

    do {
      System.out.println("x is " + x);
    } while (x != 0);
    System.out.println("all done");

    for (int idx = 3; idx > 0; idx--) {
      System.out.println("idx is " + idx);
    }

    // dont' do any of the following!!!!
    // initialization part can be, one or more variables of the same base type
    // declared, and potentially initialized
    for (int x1 = 3, y, z[] = {1, 2, 3}; ; ) {
      break;
    }
    // or initialization can be comma separated list of "statement expressions"
    // expressions that we are permitted to ignore the value of
    for (
      new StringBuilder("Really"), System.out.println("yup"), LocalDate.now();
      true;
      System.out.println("Bad stuff"), new ArrayList()) {
      break;
    }

//    String [] names = new String[]{"Fred", "Jim", "Sheila"};
    // shorthand, for use in initialized declaration
    String [] names = {"Fred", "Jim", "Sheila"};
    for (String n : names) { // arrays, and any "Iterable" (e.g. Collection, List, Set...)
      System.out.println("> " + n);
    }

    Object obj = "Hello";
    Class<?> cl = obj.getClass();
    Method [] methods = cl.getMethods();
    for (Method m : methods) {
      System.out.println(">> " + m);
    }
  }
}
