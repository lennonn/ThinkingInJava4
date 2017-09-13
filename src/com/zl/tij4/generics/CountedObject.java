//: generics/CountedObject.java
package com.zl.tij4.generics; /* Added by Eclipse.py */

public class CountedObject {
  private static long counter = 0;
  private final long id = counter++;
  public long id() { return id; }
  public String toString() { return "CountedObject " + id;}
} ///:~
