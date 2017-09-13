package com.zl.tij4.annotations;
//: annotations/UseCase.java
 /* Added by Eclipse.py */
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
  public int id();
  public String description() default "no description";
} ///:~
