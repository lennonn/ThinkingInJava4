//: typeinfo/packageaccess/HiddenC.java
package com.zl.tij4.typeinfo.packageaccess;
import static com.zl.tij4.net.mindview.util.Print.print;

import com.zl.tij4.typeinfo.interfacea.A;

class C implements A {
  public void f() { print("public C.f()"); }
  public void g() { print("public C.g()"); }
  void u() { print("package C.u()"); }
  protected void v() { print("protected C.v()"); }
  private void w() { print("private C.w()"); }
}

public class HiddenC {
  public static A makeA() { return new C(); }
} ///:~
