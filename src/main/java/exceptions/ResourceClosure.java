package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ResourceClosure {
  public static void copyFile(String in, String out) {
    try (
      // "real textual IO" is likely peformed using Scanner... examine the docs
      // also much code uses BufferedReader (readLine), and PrintWriter (println, printf)
      FileReader input = new FileReader(in);
      FileWriter output = new FileWriter(out);
      ) {
      int ch;
      while ((ch = input.read()) != -1) {
        output.write(ch);
      }
      System.out.println("completed...");
    } catch (FileNotFoundException fnfe) { // more specific exception must come first
      System.out.println("Failed, file not found: " + fnfe.getMessage());
    } catch (IOException ioe) {
      System.out.println("Copying failed: " + ioe.getMessage());
    }
    // try-with-resources i.e. try (/* resources declared here*/) {}
    // creates a compiler generated finally that closes all resources
    // as much as possible.
  }

  public static void main(String[] args) {
    copyFile("data.txt", "output.txt");
  }
}
