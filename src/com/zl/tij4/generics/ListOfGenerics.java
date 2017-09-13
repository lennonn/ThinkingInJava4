//: generics/ListOfGenerics.java
package com.zl.tij4.generics; /* Added by Eclipse.py */
import java.util.*;

public class ListOfGenerics<T> {
  private List<T> array = new ArrayList<T>();
  public void add(T item) { array.add(item); }
  public T get(int index) { return array.get(index); }
} ///:~
