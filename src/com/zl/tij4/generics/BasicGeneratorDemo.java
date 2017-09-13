//: generics/BasicGeneratorDemo.java
package com.zl.tij4.generics; /* Added by Eclipse.py */
import com.zl.tij4.net.mindview.util.BasicGenerator;
import com.zl.tij4.net.mindview.util.Generator;

public class BasicGeneratorDemo {
  public static void main(String[] args) {
    Generator<CountedObject> gen =
      BasicGenerator.create(CountedObject.class);
    for(int i = 0; i < 5; i++)
      System.out.println(gen.next());
  }
} /* Output:
CountedObject 0
CountedObject 1
CountedObject 2
CountedObject 3
CountedObject 4
*///:~
