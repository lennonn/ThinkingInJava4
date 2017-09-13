package com.zl.tij4.annotations;
//: annotations/Testable.java

import com.zl.tij4.net.mindview.atunit.Test;

public class Testable {
  public void execute() {
    System.out.println("Executing..");
  }
  @Test void testExecute() { execute(); }
} ///:~
