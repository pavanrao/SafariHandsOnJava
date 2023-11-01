package exceptions;

import java.sql.SQLException;

class MyResource implements AutoCloseable {
  private static int nextId = 0;
  private int myId = nextId++;
  {
    System.out.println("made a MyResource, id is " + myId);
  }

  @Override
  public void close() throws Exception {
    System.out.println("closing " + myId);
    throw new Exception("Closing " + myId + " failed");
  }
}

public class ResourcesTwo {
  public static void main(String[] args) {
    try (
      MyResource mr1 = new MyResource();
      MyResource mr2 = new MyResource();
      MyResource mr3 = new MyResource();
      ) {
      System.out.println("running the try...");
      if (Math.random() > 0.5) {
        throw new SQLException("Database broke");
      }
      System.out.println("db success...");
    } catch (Exception e) {
      System.out.println("got an exception " + e.getMessage());
      System.out.println("exception is: ");
      e.printStackTrace();
//      e.getSuppressed(); // can get suppresed exceptions programmtically too :)
    }
  }
}
