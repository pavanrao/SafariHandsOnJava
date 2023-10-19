package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExampleOne {
  public static void main(String[] args) /*throws FileNotFoundException*/ {
    FileReader fr = null;
    try {
      fr = new FileReader("datax.txt");
      int ch;
      while ((ch = fr.read()) != -1) { // -1 -> end of file
        System.out.print((char)ch);
      }
//      fr.close(); // might not happen!!!
//    } catch (FileNotFoundException fnfe) {
    } catch (IOException fnfe) {
      System.out.println("oops, file troubles");
    } finally {
      if (fr != null) { // YIKES, horrible!
        try {
          fr.close();
        } catch (IOException ioe) {
          System.out.println("closure failed!");
        }
      }
    }
  }
}
