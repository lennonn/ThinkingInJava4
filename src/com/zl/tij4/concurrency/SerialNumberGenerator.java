//: concurrency/SerialNumberGenerator.java
package com.zl.tij4.concurrency; /* Added by Eclipse.py */

public class SerialNumberGenerator {
  private static volatile int serialNumber = 0;
  public static int nextSerialNumber() {
    return serialNumber++; // Not thread-safe
  }
} ///:~
