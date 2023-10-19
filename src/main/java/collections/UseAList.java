package collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UseAList {
  public static void showAll(Iterable<?> stuff) {
    for (Object obj : stuff) {
      System.out.println("> " + obj);
    }
  }

  /*
Collection interfaces:
  Iterable
  Collection -- allow duplicates? null? no particular ordering
  List (allows duplicate. null?, user defined order) -- Set (rejects duplicates, null? order is not user controlled)

and: Map -- HashMap, TreeMap
   */

  public static void main(String[] args) {
//    ArrayList<String> names = new ArrayList<String>(List.of(LocalDate.now(), "Alice"));
    // since Java 7 "diamond" operator--type inference for RHS
//    ArrayList<String> names = new ArrayList<>(List.of(/*LocalDate.now(), */"Alice"));
//    List<String> names = new ArrayList<>(List.of(/*LocalDate.now(), */"Alice"));
    LinkedList<String> names = new LinkedList<>(List.of(/*LocalDate.now(), */"Alice"));
    names.add("Fred");
    names.add("Jim");
    names.add("Sheila");
    System.out.println(names);
    System.out.println(names.size());
    System.out.println(names.get(0));

    showAll(names);
  }
}
