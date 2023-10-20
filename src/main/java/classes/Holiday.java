package classes;

public class Holiday extends Date {
  {
    System.out.println("instance init block 1");
  }
  private String defaultName = "defaultName";

  public String getDefaultName() {
    System.out.println("executing getDefaultName");
//    return "Unknown";
    return defaultName;
  }
  // generally unwise to use any overridable methods during construction
  {
    System.out.println("name is " + this.name); // forward ref here requires this. !!
  }
  private String name = getDefaultName();

  public Holiday(int day, int month, int year, String name) {
    // arguments for super() must NOT refer to this in any way
    super(day, month, year); // initialize the parent elements "foundation"
    // instance initionaliztion here!!!
    // ... rest of my constructor
    System.out.println("returned to constructor");
    this.name = name;
    System.out.println("this.name is now " + name);
  }
}

// extends can only refer to a SINGLE parent class
// implements (which must follow extends if used) can enumerate many interface
class OddHoliday extends Holiday {

  public OddHoliday(int day, int month, int year, String name) {
    super(day, month, year, name);
  }

  private String myDefaultName = "Hmm, what now";
  @Override
  public String getDefaultName() {
    return myDefaultName;
  }
}
class UseAHoliday {
  public static void main(String[] args) {
//    Holiday h = new Holiday(1, 1, 2024, "New Year's Day");
    Holiday h = new OddHoliday(1, 1, 2024, "New Year's Day");

    h.showDate();
  }
}
