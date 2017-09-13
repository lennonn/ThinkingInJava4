//: strings/Immutable.java
package com.zl.tij4.strings; /* Added by Eclipse.py */
import static com.zl.tij4.net.mindview.util.Print.*;

public class Immutable {
  public static String upcase(String s) {
    return s.toUpperCase();
  }
  public static void main(String[] args) {
    String q = "howdy";
    print(q); // howdy
    String qq = upcase(q);
    print(qq); // HOWDY
    print(q); // howdy
  }
} /* Output:
howdy
HOWDY
howdy
*///:~
