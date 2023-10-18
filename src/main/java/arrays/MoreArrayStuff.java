package arrays;

import java.util.Arrays;

public class MoreArrayStuff {
  public static void main(String[] args) {
    String [] sa = new String[3];
    sa[0] = "Fred";
    System.out.println("array is: " + sa);
    System.out.println("array is: " + Arrays.toString(sa));
    // array length is fixed when created
    sa[1] = "Jim";
    sa[2] = "Sheila";
    System.out.println("array is: " + Arrays.toString(sa));
//    sa[4] = "Bad";

    String [] sa2 = new String[5];
    sa2[3] = "OK";
    System.arraycopy(sa, 0, sa2, 0, sa.length);
    System.out.println("sa is " + Arrays.toString(sa));
    System.out.println("sa2 is " + Arrays.toString(sa2));
    sa = sa2;
    System.out.println("sa is " + Arrays.toString(sa));

    // more commonly use ArrayList built on array, much
    // easier to use, but somewhat less efficient
  }
}
