package equality;

public class Examples {
  public static void main(String[] args) {
    int x = 99;
    long y = 99;
    System.out.println(x == y);

    String s = "Hello";
    String t = "He";
    System.out.println(s == t);
    // Plus does concatenation on strings...
    // operator overloading ONLY for int, long, float, double,
    // and plus for string (autoconvert a non-string if one
    // argument is String)
    t += "llo";
    System.out.println("s is " + s);
    System.out.println("t is " + t);
    System.out.println("s == t? " + (s == t));
    System.out.println("s.equals(t)? " + (s.equals(t)));

    String u = "Hello";
    System.out.println("s == u? " + (s == u));
    System.out.println("s.equals(u)? " + (s.equals(u)));

    // String is IMMUTABLE
    u.toUpperCase();
    System.out.println("u uppercase? " + u);
    System.out.println("u.toUppercase? " + u.toUpperCase());
    String v = u.toUpperCase();
    System.out.println("v? " + v);

    String w = "HELLO";
    System.out.println("v == w ? " + (v == w));
    System.out.println("v.equals(w)? " + v.equals(w));
    v = v.intern();
    System.out.println("after intern(): v == w ? " + (v == w));

    StringBuilder sb1 = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");
    System.out.println("sb1 == sb2 ? " + (sb1 == sb2));
    System.out.println("sb1.equals(sb2)? " + sb1.equals(sb2));

    sb1.append("MORE TEXT");
    System.out.println(sb1);

    sb1 = null; // now doesn't refer to anything
    System.out.println(sb1); // renders as text OK
//    sb1.append("FAILS"); // Null Pointer Exception!!!
  }
}
