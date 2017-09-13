//: generics/SuperTypeWildcards.java
package com.zl.tij4.generics; /* Added by Eclipse.py */
import java.util.*;

public class SuperTypeWildcards {
  static void writeTo(List<? super Apple> apples) {
    apples.add(new Apple());
    apples.add(new Jonathan());
    // apples.add(new Fruit()); // Error
  }
} ///:~
