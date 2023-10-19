package wrappers;

public class Examples {
  public static void main(String[] args) {
//    Object obj = 2; // performs autoboxing using Integer.valueOf...
    // using new (BAD)
    // either: get a BRAND NEW object of EXACTLY the specified type
    // or: get an exception
    // BUT WE WANT constant pooling for these types
    // AND in due course Java will make these "value" types
    // roughly the same as primitives
//    Object obj = new Integer(2);

    Object obj = Integer.valueOf(2); // "factory" method
    // autoboxing can be automatic, but only boxes, it does not promote
    long l1 = 99; // widening promotion
//    Long l2 = 99; // FAILS--cannot convert and box in one go!
    Long l2 = 99L; // works
  }
}
