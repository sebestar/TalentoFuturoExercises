/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class02.blockone;

import java.util.Random;

// [EN] Create an array with N random integers
// [ES] Cree un arreglo con N enteros aleatorios

public class Block1Exercise01 {

	final static int AMOUNT_NUMBERS = 5;
	
  public static void main(String[] args) {
    int[] numbers = getRandomNumbersArray(AMOUNT_NUMBERS);
    displayNumbersArray(numbers);
    System.out.println("Good bye!");
  }

  private static void displayNumbersArray(int[] numbers) {
    System.out.println("The random numbers in the array are: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }

  private static int[] getRandomNumbersArray(int amountNumbers) {
    int[] numbers = new int[amountNumbers];
    for (int i = 0; i < amountNumbers; i++) {
      numbers[i] = new Random().nextInt(100);
    }
    return numbers;
  }
}
