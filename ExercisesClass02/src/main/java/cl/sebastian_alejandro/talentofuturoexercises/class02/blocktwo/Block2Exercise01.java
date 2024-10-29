/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class02.blocktwo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class Block2Exercise01 {

  // [EN] Make a list with N random numbers
  // [ES] Cree una lista con N números aleatorios

  public static void main(String[] args) {
    int number = userInputNumber();
    List<Integer> randomNumbers = generateRandomNumbers(number);
    displayNumbers(randomNumbers);
    System.out.println("Good bye!");
  }

  private static ArrayList<Integer> generateRandomNumbers(int number) {
    ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
    RandomGenerator random = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create();
    for (int i = 0; i < number; i++) {
      randomNumbers.add(random.nextInt(100));
    }
    return randomNumbers;
  }

  private static void displayNumbers(List<Integer> numbers) {
    System.out.println("The numbers in the array are: ");
    StringBuilder result = new StringBuilder("[ ");
    for (int i = 0; i < numbers.size(); i++) {
      result.append(numbers.get(i));
      if (i == numbers.size() - 1) {
        result.append(" ] ");
      } else {
        result.append(", ");
      }
    }
    System.out.println(result.toString());
  }

  private static int userInputNumber() {
	  System.out.println("Enter the amount of random numbers"); 
    return new Scanner(System.in).nextInt();
  }
}
