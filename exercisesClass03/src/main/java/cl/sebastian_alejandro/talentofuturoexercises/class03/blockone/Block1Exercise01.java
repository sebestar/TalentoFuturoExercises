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

public class Block1Exercise01 {

  // [EN] Get the intersection of two sets
  // [ES] Obtenga la intersección de dos conjuntos

  static final int[] SET_A = {1, 2, 3, 4, 5};
  static final int[] SET_B = {4, 5, 6, 7};

  public static void main(String[] args) {
    showIntersectionBetweenTwoSets();
    System.out.println("Good bye!");
  }

  private static void showIntersectionBetweenTwoSets() {
    displayNumberArray(SET_A, "SET A");
    displayNumberArray(SET_B, "SET B");
    int[] setIntersection = setsIntersection(SET_A, SET_B);
    System.out.println("\nResults:");
    displayNumberArray(setIntersection, "Intersection");
  }

  private static int[] setsIntersection(int[] setA, int[] setB) {
    List<Integer> intersection = new ArrayList<Integer>();
    for (int itemA : setA) {
      for (int itemB : setB) {
        if (itemA == itemB) intersection.add(itemA);
      }
    }
    return intersection.stream().mapToInt(Integer::intValue).toArray();
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
