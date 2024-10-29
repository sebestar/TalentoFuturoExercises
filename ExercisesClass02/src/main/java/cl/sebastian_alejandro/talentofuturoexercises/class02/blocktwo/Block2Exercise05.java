/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class02.blocktwo;

import java.util.ArrayDeque;

public class Block2Exercise05 {

  // [EN] Reverse a string using a stack
  // [ES] Invierta una cadena utilizando una pila

  public static void main(String[] args) {
    String sentence = "Able was I, I saw Elba";
    ArrayDeque<String> stackSentence = new ArrayDeque<String>();
    for (char letter : sentence.toCharArray()) {
      stackSentence.push(Character.toString(letter));
    }
    StringBuilder reversed = new StringBuilder();
    while (!stackSentence.isEmpty()) {
      reversed.append(stackSentence.pop());
    }
    System.out.println("Original Sentence");
    System.out.println(sentence);
    System.out.println("\nReversed Sentence");
    System.out.println(reversed.toString());
    System.out.println("\nGood bye!");
  }
}
