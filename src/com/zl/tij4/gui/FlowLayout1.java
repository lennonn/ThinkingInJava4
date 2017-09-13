//: gui/FlowLayout1.java
package com.zl.tij4.gui;
// Demonstrates FlowLayout.
import javax.swing.*;
import java.awt.*;
import static com.zl.tij4.net.mindview.util.SwingConsole.*;

public class FlowLayout1 extends JFrame {
  public FlowLayout1() {
    setLayout(new FlowLayout());
    for(int i = 0; i < 20; i++)
      add(new JButton("Button " + i));
  }
  public static void main(String[] args) {
    run(new FlowLayout1(), 300, 300);
  }
} ///:~
