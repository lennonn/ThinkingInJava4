//: holding/UniqueWordsAlphabetic.java
package com.zl.tij4.holding; /* Added by Eclipse.py */
// Producing an alphabetic listing.
import java.util.Set;
import java.util.TreeSet;

import com.zl.tij4.net.mindview.util.TextFile;

public class UniqueWordsAlphabetic {
  public static void main(String[] args) {
    Set<String> words =
      new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
    words.addAll(
      new TextFile("SetOperations.java", "\\W+"));
    System.out.println(words);
  }
} /* Output:
[A, add, addAll, added, args, B, C, class, Collections, contains, containsAll, D, E, F, false, from, G, H, HashSet, holding, I, import, in, J, java, K, L, M, main, mindview, N, net, new, Output, Print, public, remove, removeAll, removed, Set, set1, set2, SetOperations, split, static, String, to, true, util, void, X, Y, Z]
*///:~
