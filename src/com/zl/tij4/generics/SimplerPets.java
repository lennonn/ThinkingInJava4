//: generics/SimplerPets.java
package com.zl.tij4.generics; /* Added by Eclipse.py */
import typeinfo.pets.*;
import java.util.*;
import static com.zl.tij4.net.mindview.util.*;

public class SimplerPets {
  public static void main(String[] args) {
    Map<Person, List<? extends Pet>> petPeople = New.map();
    // Rest of the code is the same...
  }
} ///:~
