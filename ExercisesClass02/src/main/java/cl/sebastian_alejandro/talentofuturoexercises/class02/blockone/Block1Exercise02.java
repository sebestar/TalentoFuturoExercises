/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class02.blockone;

public class Block1Exercise02 {

  // [EN] Calculate the average of an array of integers
  // [ES] Calcule el promedio de un arreglo de enteros

  public static void main(String[] args) {
    double[] grades = {70, 55, 45, 33, 67};
    double averageGrades = calculateAverageArray(grades);
    displayNumbersArray(grades);
    displayAverageGrades(averageGrades);
    System.out.println("Good bye!");
  }

  private static void displayAverageGrades(double averageGrades) {
    System.out.println(String.format("The average of the grades is: %,.1f.", averageGrades));
  }

  private static void displayNumbersArray(double[] numbers) {
    System.out.print("The numbers in the array are: \n[ ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println("]"); 
  }

  private static double calculateAverageArray(double[] grades) {
    double averageGrades = 0;
    for (int i = 0; i < grades.length; i++) {
      averageGrades += grades[i];
    }
    return averageGrades / grades.length;
  }
}
