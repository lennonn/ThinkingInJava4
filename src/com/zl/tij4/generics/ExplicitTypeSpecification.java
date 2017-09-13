//: generics/ExplicitTypeSpecification.java
package com.zl.tij4.generics; /* Added by Eclipse.py */
import java.util.List;
import java.util.Map;

import com.zl.tij4.net.mindview.util.New;
import com.zl.tij4.typeinfo.pets.Person;
import com.zl.tij4.typeinfo.pets.Pet;

public class ExplicitTypeSpecification {
  static void f(Map<Person, List<Pet>> petPeople) {}
  public static void main(String[] args) {
    f(New.<Person, List<Pet>>map());
  }
} ///:~
