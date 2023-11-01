package classes.instanceinner;

import java.time.LocalDate;
import java.util.Iterator;

public class MyList<E> implements Iterable<E> {
  private E[] data = (E[])new Object[10];
  private int count = 0;

  public void add(E e) {
    data[count++] = e; // NO OVERFLOW CHECK!!!
  }

  public E get(int idx) {
    if (idx >= 0 && idx < count) {
      return data[idx];
    } else throw new IndexOutOfBoundsException("Bad index " + idx);
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder("MyList[");
    for (int i = 0; i < count; i++) {
      res.append(data[i]).append(", ");
    }
    res.setLength(res.length() - 2);
    res.append("]");
    return res.toString();
  }

  private class MyIterator implements Iterator {
    private int progress = 0;

//    public MyIterator(MyList<E> MyList$this) {
    public MyIterator() {
    }

    @Override
    public boolean hasNext() {
      return progress < count; // count is implicitly MyList$this.count
    }

    @Override
    public E next() {
      return data[progress++];
    }
  }

  public Iterator<E> iterator() {
//    return this.new MyIterator();
    return new MyIterator();
  }
}

class UseMyList {
  public static void main(String[] args) {
    MyList<String> names = new MyList<>();
    names.add("Fred");
//    names.add(LocalDate.now());
    names.add("Sheila");
    System.out.println(names);
    String nZero = names.get(0);

    MyList<LocalDate> mld = new MyList<>();
    mld.add(LocalDate.now());
    mld.add(LocalDate.now().plusDays(1));
    System.out.println(mld);

    System.out.println("------------------");
    for (String s : names) {
      System.out.println("> " + s);
    }
  }
}