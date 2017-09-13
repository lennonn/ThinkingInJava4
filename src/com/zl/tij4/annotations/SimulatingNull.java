package com.zl.tij4.annotations;
//: annotations/SimulatingNull.java
 /* Added by Eclipse.py */
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SimulatingNull {
  public int id() default -1;
  public String description() default "";
} ///:~
