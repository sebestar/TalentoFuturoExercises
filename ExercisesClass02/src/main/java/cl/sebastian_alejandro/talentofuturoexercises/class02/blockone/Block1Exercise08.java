/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class02.blockone;

public class Block1Exercise08 {

  // [EN] Compute a matrix that represents the difference between the elements of an array
  // [ES] Calcule una matriz que represente la diferencia entre los elementos de un arreglo

  static final int[] NUMBERS = {5, 8, 3, 9, 7, 4, 10, 2, 1, 6};

  public static void main(String[] args) {
    displayNumberArray(NUMBERS);
    int[][] differenceMatrix = calculateDifferenceMatrix(NUMBERS);
    displayMatrix(differenceMatrix);
    System.out.println("Good bye!");
  }

  private static void displayMatrix(int[][] differenceMatrix) {
    System.out.println("\nThe result of the difference of the matrix is: ");
    SquareMatrixBorders myMatrix = new SquareMatrixBorders(differenceMatrix);
    System.out.print(myMatrix.getDisplayMatrix());
  }

  private static int[][] calculateDifferenceMatrix(int[] numbers) {
    int[][] diffMatrix = new int[numbers.length][numbers.length];
    for (int i = 0; i < diffMatrix.length; i++) {
      for (int j = 0; j < diffMatrix.length; j++) {
        diffMatrix[i][j] = numbers[i] - numbers[j];
      }
    }
    return diffMatrix;
  }

  private static void displayNumberArray(int[] numbers) {
    System.out.println("The numbers in the array are: ");
    StringBuilder result = new StringBuilder("[ ");
    for (int i = 0; i < numbers.length; i++) {
      result.append(numbers[i]);
      if (i == numbers.length - 1) {
        result.append(" ] ");
      } else {
        result.append(", ");
      }
    }
    System.out.println(result.toString());
  }
}
