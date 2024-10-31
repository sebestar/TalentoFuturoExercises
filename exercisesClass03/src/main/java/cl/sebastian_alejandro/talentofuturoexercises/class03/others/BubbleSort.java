/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class03.others;

public class BubbleSort {

  static final int[] DISORDERED_NUMBERS = {7, 22, 11, 8, 101, 15};

  public static void main(String[] args) {
    displayNumberArray(DISORDERED_NUMBERS);
    int orderedNumbers[] = sortNumbers(DISORDERED_NUMBERS);
    displayNumberArray(orderedNumbers);
    System.out.println("Good bye!");
  }

  private static int[] sortNumbers(int[] disorderedNumbers) {
    return bubbleSort(disorderedNumbers);
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

  private static int[] bubbleSort(int[] original) {
    int aux;
    int wall = 0;
    boolean inverted = true;
    while (inverted || wall < original.length) {
      inverted = false;
      for (int i = 1; i < ((original.length) - wall); i++) {
        if (original[i] < original[i - 1]) {
          inverted = true;
          aux = original[i - 1];
          original[i - 1] = original[i];
          original[i] = aux;
        }
      }
      wall++;
    }
    return original;
  }
}
