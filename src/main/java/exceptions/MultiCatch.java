package exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class MultiCatch {
  public static void mightBreak() throws IOException, SQLException {
    if (Math.random() > 0.66) throw new IOException("IO busted");
    if (Math.random() > 0.5) throw new SQLException("DB broke");
  }

  public static void main(String[] args) {
    try {
      mightBreak();
      System.out.println("Successful try block");
// UGLY duplication...
//    } catch (IOException ioe) {
//      System.out.println(ioe.getMessage());
//    } catch (SQLException sqle) {
//      System.out.println(sqle.getMessage());
//    }
// UGLY, catches more than you intended
//    } catch (Exception ioe) {
//      System.out.println(ioe.getMessage());
//    }
      // multi-catch :) these must be UNRELATED by class hierarchy
    } catch (IOException | SQLException ex) {
      System.out.println(ex.getMessage());
    }

    // RuntimeException and subclasses are not-checked. They represent bugs!
    // the REST of the Exception subtypes plus Throwable are "checked"
    // these represent "environmental" problems, i.e. program is "sane"
    // and recovery is polite. These, the compiler forces either catch, or throws.
    // Error, are environmental, but probably catastrophic and unrecoverable.
    // e.g. OutOfMemoryError, JVMError, also unchecked
  }
}
