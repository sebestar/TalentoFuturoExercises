/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class01.blocktwo;

public class Block2Exercise04 {

  // [EN] Print a string in reverse order
  // [ES] Imprima una cadena en orden inverso

  public static void main(String[] args) {
    String phrase = "A dog walking with a cat";
    System.out.println(phrase);
    printReverseOrder(phrase);
    System.out.println("Good bye!");
  }

  private static void printReverseOrder(String phrase) {
    System.out.println(new StringBuilder(phrase).reverse().toString());
  }
}
