package interfaces;

public interface Photographer {
  // cannot have "normal" fields
  public static final int FAIR_MARKET = 2_000;

  // all methods declared in an inteface are
  // either public (by default) or private (explicitly)
  // a majority are probably abstract (i.e. rather like documentation)
  // public and abstract are redundant but legal
  /*public abstract*/ String takePhoto(String subject);

  // since Java 8, can have static (public or private)
  // interfaces represent concepts in their abstract forms
  // static methods work on the concept as a whole
  // this is public, can also be private explicitly
  static String getCapability() {
    return "takes pictures";
  }

  // can have private instance methods
  // simply factor out common features..

  // can have "default" methods
  // provide a fallback for anything that doesn't actually
  // supply the method itself--for extending an interface

  default int getBill() {
    return 0;
  }
}
