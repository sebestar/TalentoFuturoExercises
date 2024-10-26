/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class02.blockone;

public class Block1Exercise05 {

  // [EN] Calculate the range of an array of integers
  // [ES] Calcule el rango de un arreglo de enteros

  static final int[] DISORDERED_NUMBERS = {85, 22, 11, 8, 99, 15};

  public static void main(String[] args) {
    displayNumberArray(DISORDERED_NUMBERS);
    displayArrayRange(DISORDERED_NUMBERS);
    System.out.println("Good bye!");
  }

  private static void displayArrayRange(int[] disorderedNumbers) {
    int range = calculateArrayRange(disorderedNumbers);
    System.out.println(String.format("The range of the array is: %d.", range));
  }

  private static int calculateArrayRange(int[] arrayNumbers) {
    int largest = findLargestNumber(arrayNumbers);
    int smallest = findSmallestNumber(arrayNumbers);
    return largest - smallest;
  }

  private static int findSmallestNumber(int[] arrayNumbers) {
    int smallest = (arrayNumbers.length > 0) ? arrayNumbers[0] : 0;
    for (int i = 1; i < arrayNumbers.length; i++) {
      if (arrayNumbers[i] < smallest) smallest = arrayNumbers[i];
    }
    return smallest;
  }

  private static int findLargestNumber(int[] arrayNumbers) {
    int largest = (arrayNumbers.length > 0) ? arrayNumbers[0] : 0;
    for (int i = 1; i < arrayNumbers.length; i++) {
      if (arrayNumbers[i] > largest) largest = arrayNumbers[i];
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
