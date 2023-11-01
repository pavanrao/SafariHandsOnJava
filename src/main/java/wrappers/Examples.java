package wrappers;

import java.util.ArrayList;
import java.util.List;

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

    l1 = l2; // autounboxing

    // NOPE, can only create collections etc. of REFERENCE types, not primitives
//    List<int> nums = new ArrayList<>();
    List<Integer> nums = new ArrayList<>();
    nums.add(1); // autoboxing again :)
    nums.add(2);
    int x = nums.get(0); // autounboxing.

    // excessive autoboxing/unboxing with large amounts of data
    // MIGHT become a performance issue. (CPU and memory allocation/GC)
    // IF you have an EASY route to avoid this, use it.
    // OTHERWISE, if a profiler tells you that boxing is the cause of your
    // unaccetable performance, then find a way to avoid it
    // (e.g. int [] rather than List<Integer>)
  }
}
