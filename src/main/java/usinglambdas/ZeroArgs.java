package usinglambdas;

import java.lang.reflect.Method;

@FunctionalInterface
interface ZeroArgInterface {
//  void doStuff();
  String get();
}

public class ZeroArgs {

  public static void useZeroArgs(ZeroArgInterface zai) {
    System.out.println(zai.get());
  }
  public static void main(String[] args) {
    ZeroArgInterface zai = () -> "Hello";
    useZeroArgs(zai);

    Class<?> cl = zai.getClass();
    System.out.println("class is called: " + cl.getName());
    Method[] methods = cl.getMethods();
    for (Method m : methods) {
      System.out.println("> " + m);
    }
  }
}
