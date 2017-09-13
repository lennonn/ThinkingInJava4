//: interfaces/interfaceprocessor/Apply.java
package com.zl.tij4.interfaces.interfaceprocessor;
import static com.zl.tij4.net.mindview.util.Print.*;

public class Apply {
  public static void process(Processor p, Object s) {
    print("Using Processor " + p.name());
    print(p.process(s));
  }
} ///:~
