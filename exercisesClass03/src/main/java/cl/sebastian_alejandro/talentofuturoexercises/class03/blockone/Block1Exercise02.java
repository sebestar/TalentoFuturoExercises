/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class03.blockone;

import java.util.ArrayList;
import java.util.List;

public class Block1Exercise02 {

  // [EN] Get the difference of two sets
  // [ES] Obtenga la diferencia de dos conjuntos

  static final int[] SET_A = {1, 2, 3, 4, 5};
  static final int[] SET_B = {4, 5, 6, 7};

  public static void main(String[] args) {
    showDifferenceBetweenTwoSets();
    System.out.println("Good bye!"); 
  }

  private static void showDifferenceBetweenTwoSets() {
    displayNumberArray(SET_A, "SET A");
    displayNumberArray(SET_B, "SET B");
    int[] setDifference = setsDifference(SET_A, SET_B);
    System.out.println("\nResults:");
    displayNumberArray(setDifference, "Difference");
  }

  private static int[] setsDifference(int[] minuendSet, int[] subtrahendSet) {
    List<Integer> difference = new ArrayList<Integer>();
    boolean found;
    for (int itemA : minuendSet) {
      found = false;
      for (int itemB : subtrahendSet) {
        if (itemA == itemB) {
          found = true;
          break;
        }
      }
      if (!found) difference.add(itemA);
    }
    return difference.stream().mapToInt(Integer::intValue).toArray();
  }

  private static void displayNumberArray(int[] disorderedNumbers, String nameArray) {
    System.out.println(String.format("The numbers in the %s array are: ", nameArray));
    displayNumberArray(disorderedNumbers);
  }

  private static void displayNumberArray(int[] disorderedNumbers) {
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
