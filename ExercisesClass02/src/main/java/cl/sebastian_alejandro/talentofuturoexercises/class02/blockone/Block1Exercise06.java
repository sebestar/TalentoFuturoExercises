/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class02.blockone;

public class Block1Exercise06 {

  // [EN] Calculate the standard deviation of an array of integers
  // [ES] Calcule la desviación estándar de un arreglo de enteros

  static final int[] POSITIVE_NUMBERS = {85, 22, 11, 8, 99, 15};
  // The numbers must be between 1 and N in this ecuation.

  public static void main(String[] args) {
    displayNumberArray(POSITIVE_NUMBERS);
    displayStandardDeviation(POSITIVE_NUMBERS);
    System.out.println("Good bye!");
  }

  private static void displayStandardDeviation(int[] numbers) {
    double standardDeviation = calculateStardardDeviation(numbers);
    System.out.println(String.format("The Standard Deviation is: %,.2f.", standardDeviation));
  }

  private static double calculateStardardDeviation(int[] numbers) {
	  double variance = calculateVariance(numbers);
	  return Math.sqrt(variance);
  }

  private static double calculateVariance(int[] numbers){
	  double average = calculateAverageArray(numbers);
	  double summation = 0;
	  for (int i = 0; i < numbers.length; i++) 
		  summation += Math.pow((numbers[i] - average), 2);
	  return summation / numbers.length;
  }

private static double calculateAverageArray(int[] numbers) {
    double average = 0;
    for (int i = 0; i < numbers.length; i++) {
      average += numbers[i];
    }
    return average / numbers.length;
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
