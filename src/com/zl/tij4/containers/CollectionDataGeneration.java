//: containers/CollectionDataGeneration.java
package com.zl.tij4.containers; /* Added by Eclipse.py */
// Using the Generators defined in the Arrays chapter.
import java.util.ArrayList;
import java.util.HashSet;

import com.zl.tij4.net.mindview.util.CollectionData;
import com.zl.tij4.net.mindview.util.RandomGenerator;

public class CollectionDataGeneration {
  public static void main(String[] args) {
    System.out.println(new ArrayList<String>(
      CollectionData.list( // Convenience method
        new RandomGenerator.String(9), 10)));
    System.out.println(new HashSet<Integer>(
      new CollectionData<Integer>(
        new RandomGenerator.Integer(), 10)));
  }
} /* Output:
[YNzbrnyGc, FOWZnTcQr, GseGZMmJM, RoEsuEcUO, neOEdLsmw, HLGEahKcx, rEqUCBbkI, naMesbtWH, kjUrUkZPg, wsqPzDyCy]
[573, 4779, 871, 4367, 6090, 7882, 2017, 8037, 3455, 299]
*///:~
