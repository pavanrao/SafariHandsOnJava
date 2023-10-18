package instanceofandsealed;

// permits is optional IF, but only if, all specializations are in
// this source file!
sealed interface Transporter permits Car, Truck, Bicycle {}
final class Car implements Transporter {}
non-sealed class Truck implements Transporter {}
// can also have a sealed specialization of a sealed type.
// but then it must have subtypes, they in turn must be
// sealed, non-sealed, or final (or "final-like", enum and records)

enum Bicycle implements Transporter {}

public final class InstanceofAndSealed {
  public static void main(String[] args) {
//    Object t = new Car();
//    if (t instanceof Car) {
//      System.out.println("working with a car");
//      Car c = (Car)t;
//    } else if (t instanceof Truck) {
//      System.out.println("working with a truck");
//      Truck tr = (Truck)t;
//    }

    // Pattern matching with instanceof, avoids separate cast :)
//    if (t instanceof Car c) {
//      System.out.println("working with a car " + c);
//    } else if (t instanceof Truck tr) {
//      System.out.println("working with a truck " + tr);
//    }

    Transporter t = new Car();
    switch (t) {
      case Car c -> System.out.println("working with a car " + c);
      case Truck tr -> System.out.println("working with a truck " + tr);
      case Bicycle b -> System.out.println("I had to add this to complete the switch");
    }
  }
}
