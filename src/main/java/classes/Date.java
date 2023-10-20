package classes;

public class Date {
  public static final int MONTHS_IN_YEAR = 12;

  // warning: this is NOT a "CONSTANT":
  private static final StringBuilder name_of_last_month = new StringBuilder("December");

  class Thingy {
    private int x;
  }
  class OtherThingy {
    private int y;
  }
  // private means "accessible anywhere between the enclosing TOP-LEVEL curlies
  // surrounding the declaration
  // if your class has mutable fields, make the PRIVATE always!
  private int day = -1; // instance initialization occurs at the point marked ***HERE
  private int month;
  private int year;

  // default constructor (ONLY if ZERO constructor in the source):
//  public Date() {
//    super(); // initialize the parent elements "foundation"
//    // any other initialization of this object
//    // ***HERE
//    // can have additional code if we choose
//  }

  public Date(int d, int month, int year) {
    // super(); // this is implicit if omitted
    // ***HERE
    // now we can add our own stuff...
    // object created by "new" is passed in using the name "this"
    if (isValid(d, month, year)) {
      this.day = d;
      this.month = month;
      this.year = year;
    } else {
      throw new IllegalArgumentException("Bad values for a date");
    }
    System.out.println("Returning from Date constructor");
  }

//  public static void setDay(Date d, int day) {
//  public void setDay(Date this, int day) {
  public void setDay(int day) {
    if (isValid(day, this.month, this.year)) {
      this.day = day;
    } else {
      throw new IllegalArgumentException("bad day for date");
    }
  }

//  public static void showDate(Date d) {
//  public void showDate(Date this) {
  public void showDate() { // stylistically "normal"
//    System.out.println("Date is " + d.day + " / " + d.month + " / " + d.year);
    System.out.println("Date is " + this.day + " / " + this.month + " / " + this.year);
  }

  public static boolean isLeap(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  public static int daysInMonth(int month, int year) {
    return switch (month) {
      case 9, 4, 6, 11 -> 30;
      case 2 -> isLeap(year) ? 29 : 28;
      case 1, 3, 5, 7, 8, 10, 12 -> 31;
      default -> throw new IllegalArgumentException("Bad month value");
    };
  }

  public static boolean isValid(int day, int month, int year) {
    return day > 0 && day <= daysInMonth(month, year)
      && month > 0 && month <= /*Date.*/MONTHS_IN_YEAR;
  }
}

class UseDate {

  public static void main(String[] args) {
//    int day = 12;
//    int month = 3;
//    int year = 2023;

    // *new* Date allocates storage and zeros it (the new keyword does this...)
    // then the allocated object is passed to a matching constructor
//    Date d = new Date();
//    d.day = 12;
//    d.month = 13;
//    d.year = 2023;
    Date d = new Date(12, 12, 2023);

//    Date.showDate(d);
    d.showDate();

//    d.month = -33;
//    Date.setDay(d, 5);
    d.setDay(5);
//    Date.showDate(d);
    d.showDate();

    Date d2 = new Date(19, 10, 2023);
  }
}
