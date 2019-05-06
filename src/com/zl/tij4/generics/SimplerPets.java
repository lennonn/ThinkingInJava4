//: generics/SimplerPets.java
package com.zl.tij4.generics; /* Added by Eclipse.py */
import com.zl.tij4.net.mindview.util.New;
import com.zl.tij4.typeinfo.pets.Person;
import com.zl.tij4.typeinfo.pets.Pet;
import java.util.*;


public class SimplerPets {
  public static void main(String[] args) {
    Map<Person, List<? extends Pet>> petPeople = New.map();
    // Rest of the code is the same...
  }
} ///:~
