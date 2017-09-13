//: generics/LimitsOfInference.java
package com.zl.tij4.generics; /* Added by Eclipse.py */
import java.util.List;
import java.util.Map;

import pets.Person;
import pets.Pet;

public class LimitsOfInference {
  static void
  f(Map<Person, List<? extends Pet>> petPeople) {}
  public static void main(String[] args) {
    // f(New.map()); // Does not compile
  }
} ///:~
