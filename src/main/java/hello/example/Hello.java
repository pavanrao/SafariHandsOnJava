package hello.example;

//import java.lang.System; // do not have to import this, it's always available
import static java.lang.System.out;

/*
 this is also
 a comment
 */

/**
 * This is a documentation comment
 * @author Simon
 *  investigate use of javadoc for your serious code!
 */
public class Hello {
  public static void main(String [] args) {
//    java.lang.System.out.println("Hello World!");
//    System.out.println("Hello World!");
    out.println("Hello World!");
    // real programming (procedural at least) requires
    // variables, sequence, iteration, and selection

    // Variables: strongly, statically typed
    // declare as: type <identifier> [ = initializing expression ]
    int x;
    if (Math.random() < 10) {
      x = 100;
    } else {
      x = 200; // necessary for definite initialization!
    }
//    int x = 99;
    // java insists on definite initialization, for local vars, that's our problem
    out.println(x);
    // block scoped
    {
      int y = 100;
      out.println(y);
    }
//    out.println(y); // out of scope

    // Java has 8 "primitive" types: boolean, byte, short, char, int, long, float, double
    // Java does NOT have "truthy/falsy"
    // also quite limited in "automatic conversions"
    long bigx = 99;
    bigx = 3_000_000_000L; // also F to force float type, D to force double type
//    x = bigx; // NOT ALLOWED, might not fit
    bigx = x; // allowed, widening conversion
    // narrowing conversions must be explicit
    x = (int)bigx; // called a "cast" -- "trust me compiler, I'm an engineer!!"


    x = 10;
//    if (x) {} // "truthy"?? NOT ALLOWED IN JAVA
    if (x != 0) {} //

    // operators, much like C, C++, C#, JavaScript...
    // + - * /
    // result type of a single arithmetic operation will be the larger of
    // the two operands, but at least int. Java does NOT do arithmetic in
    // less than int
    // % -- NOT MOD, THIS IS REMAINDER -- differ with negative values
    // comparisons
    // < <= > >= == !=
    // bitwise
    // & - AND, | - OR, ^ - XOR, ~ (tilde) bitwise inversion
    // short circuit operators
    // &&, ||

    // SINCE JAVA 10, we can (sometimes) use type inference for variable declaration:

    // exactly equivalent to int t = 100, because RHS is int type!!
    // NOT dynamic typing
    var t = 100;
//    t = "Hello"; // NOPE, t is int!!
  }
}
