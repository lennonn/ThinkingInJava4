//: generics/RestrictedComparablePets.java
package com.zl.tij4.generics; /* Added by Eclipse.py */

class Hamster extends ComparablePet
implements Comparable<ComparablePet> {
  public int compareTo(ComparablePet arg) { return 0; }
}

// Or just:

class Gecko extends ComparablePet {
  public int compareTo(ComparablePet arg) { return 0; }
} ///:~
