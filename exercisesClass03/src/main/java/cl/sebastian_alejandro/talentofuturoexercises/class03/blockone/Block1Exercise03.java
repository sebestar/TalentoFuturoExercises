/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class03.blockone;

public class Block1Exercise03 {

  // [EN] Check if a set B is a subset (contained) within a set A
  // [ES] Compruebe si un conjunto B es subconjunto (está contenido) dentro de un conjunto A

  static final int[] SET_A = {3, 2, 1, 0};
  static final int[] SET_B = {5, 4, 3};
  static final int[] SET_C = {1, 2};
  static final int[] EMPTY_SET = {};

  public static void main(String[] args) {
    showSubsetBetweenTwoSets();
    System.out.println("\nGood bye!");
  }

  private static void showSubsetBetweenTwoSets() {
    displayNumberArray(SET_A, "SET A");
    displayNumberArray(SET_B, "SET B");
    displayNumberArray(SET_C, "SET C");
    displayNumberArray(EMPTY_SET, "EMPTY SET");
    boolean isSetBSubsetOfA = isSubset(SET_A, SET_B);
    boolean isSetCSubsetOfA = isSubset(SET_A, SET_C);
    // According to theory: Empty set is subset of any sets
    boolean isEmptySetSubsetOfA = isSubset(SET_A, EMPTY_SET);
    System.out.println("\nResults, is Subset of Set A:");
    System.out.println(String.format("SET B     : %s", isSetBSubsetOfA));
    System.out.println(String.format("SET C     : %s", isSetCSubsetOfA));
    System.out.println(String.format("Empty Set : %s", isEmptySetSubsetOfA));
  }

  private static boolean isSubset(int[] setA, int[] setB) {
    boolean isSubset = true;
    for (int itemB : setB) {
      boolean found = false;
      for (int itemA : setA) {
        if (itemB == itemA) {
          found = true;
          break;
        }
      }
      if (!found) {
        isSubset = false;
        break;
      }
    }
    return isSubset;
  }

  private static void displayNumberArray(int[] disorderedNumbers, String nameArray) {
    System.out.println(String.format("The numbers in the %s array are: ", nameArray));
    displayNumberArray(disorderedNumbers);
  }

  // TODO: Fixed version of displayNumberArray, others versions must be fixed.
  // previous versions has errors displaying empty arrays.
  private static void displayNumberArray(int[] disorderedNumbers) {
    StringBuilder result = new StringBuilder("[ ");
    for (int i = 0; i < disorderedNumbers.length; i++) {
      result.append(disorderedNumbers[i]);
      if (i != disorderedNumbers.length - 1) {
        result.append(", ");
      }
    }
    result.append(" ] ");
    System.out.println(result.toString());
  }
}
