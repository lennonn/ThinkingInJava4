package com.zl.tij4.annotations;
//: annotations/InterfaceExtractorProcessorFactory.java
// APT-based annotation processing.

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import com.sun.mirror.apt.*;
import com.sun.mirror.declaration.*;

public class InterfaceExtractorProcessorFactory
  implements AnnotationProcessorFactory {
  public AnnotationProcessor getProcessorFor(
    Set<AnnotationTypeDeclaration> atds,
    AnnotationProcessorEnvironment env) {
    return new InterfaceExtractorProcessor(env);
  }
  public Collection<String> supportedAnnotationTypes() {
    return
     Collections.singleton("annotations.ExtractInterface");
  }
  public Collection<String> supportedOptions() {
    return Collections.emptySet();
  }
} ///:~
