package myconsumer;

import supplythis.MyServiceIF;
import supplythis.MySupplier;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

public class Consume {
  public static void main(String[] args) throws Throwable {
    System.out.println("in my main method");
    System.out.println("message is " + supplythis.MySupplier.message);
    // with JPMS, the following line is rejected :)
//    System.out.println("secret message is " + notforpublicuse.MySecret.internalMessage);

    Class<?> cl = MySupplier.class;
    Field field = cl.getDeclaredField("privateMessage");
    field.setAccessible(true); // disables access checks
    String secret = (String)field.get(null);
    System.out.println("Secret/private message is " + secret);

    ServiceLoader<MyServiceIF> serviceLoader = ServiceLoader.load(MyServiceIF.class);
    for (MyServiceIF srv : serviceLoader) {
      System.out.println("found a service: " + srv.getClass().getName());
      System.out.println("Message from this service is " + srv.getMessage());
    }
  }
}
