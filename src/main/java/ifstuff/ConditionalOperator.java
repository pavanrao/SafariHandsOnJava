package ifstuff;

public class ConditionalOperator {
  public static void main(String[] args) {
    boolean x = Math.random() > 0.5;

    // conditional operator, sometimes called "ternary" operator
    // because there are three operands
    String message = x ? "It's big" : "nope, it's not big";

    // primitive type, used where object is needed->autoboxing
    // var can create a "non-denotable" type i.e. something for which
    // the source cannot describe the type
    var result = x ? "Hello" : 99; // 99 -> Integer.valueOf(99), this is an object :)
    result.compareTo(null); // OK with non-denotable type :)
  }
}
