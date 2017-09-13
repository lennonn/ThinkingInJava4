//: holding/StackTest.java
package com.zl.tij4.holding; /* Added by Eclipse.py */
import com.zl.tij4.net.mindview.util.Stack;

public class StackTest {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();
    for(String s : "My dog has fleas".split(" "))
      stack.push(s);
    while(!stack.empty())
      System.out.print(stack.pop() + " ");
  }
} /* Output:
fleas has dog My
*///:~
