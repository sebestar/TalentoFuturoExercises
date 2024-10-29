/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class02.blocktwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Block2Exercise03 {

  // [EN] Invert the elements of a list
  // [ES] Invierta los elementos de una lista

  public static void main(String[] args) {
    List<String> words =
        new ArrayList<String>(Arrays.asList("actions", "speak", "louder", "than", "words"));
    System.out.println(
        String.format("The original sentence is: %s", words.toString().replace(",", "")));
    System.out.println(
        String.format(
            "The inverted sentence id: %s", words.reversed().toString().replace(",", "")));
    System.out.println("Good bye!"); 
  }
}
