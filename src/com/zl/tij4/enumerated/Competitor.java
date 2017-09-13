//: enumerated/Competitor.java
// Switching one enum on another.
package com.zl.tij4.enumerated;

public interface Competitor<T extends Competitor<T>> {
  Outcome compete(T competitor);
} ///:~
