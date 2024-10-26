/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class02.blockone;

public class Block1Exercise03 {

  // [EN] Get the largest value from an array of integers
  // [ES] Obtenga el mayor valor de un arreglo de enteros

  static final int[] DISORDERED_NUMBERS = {7, 22, 11, 8, 99, 15};

  public static void main(String[] args) {
    displayNumberArray(DISORDERED_NUMBERS);
    int largestNumber = findLargestNumber(DISORDERED_NUMBERS);
    System.out.println(String.format("The largest number is: %d.", largestNumber));
    System.out.println("Good bye!"); 
  }

  private static int findLargestNumber(int[] disorderedNumbers) {
    int largest = (disorderedNumbers.length > 0) ? disorderedNumbers[0] : 0;
    for (int i = 1; i < disorderedNumbers.length; i++) {
      if (disorderedNumbers[i] > largest) largest = disorderedNumbers[i];
    }
    return largest;
  }

  private static void displayNumberArray(int[] disorderedNumbers) {
    System.out.println("The numbers in the array are: ");
    StringBuilder result = new StringBuilder("[ ");
    for (int i = 0; i < disorderedNumbers.length; i++) {
      result.append(disorderedNumbers[i]);
      if (i == disorderedNumbers.length - 1) {
        result.append(" ] ");
      } else {
        result.append(", ");
      }
    }
    System.out.println(result.toString());
  }
}
