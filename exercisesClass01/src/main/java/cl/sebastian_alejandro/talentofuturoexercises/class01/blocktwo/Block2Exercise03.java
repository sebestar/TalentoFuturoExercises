/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class01.blocktwo;

import java.util.Scanner;

public class Block2Exercise03 {

  // [EN] Determine if a number is prime
  // [ES] Determine si un numero es primo

  // TODO: Find a way to make this search without using Brute Force.

  public static void main(String[] args) {
    int userInputNumber = getUserInput("Insert a number: ");
    isPrimeNumber(userInputNumber);
    System.out.println("Good bye!");
  }

  private static void isPrimeNumber(int userInputNumber) {
    boolean isPrime = false;
    for (int i = 2; i <= userInputNumber; i++) {
      if (i == userInputNumber) {
        isPrime = true;
        break;
      } else if (userInputNumber % i == 0) {
        break;
      }
    }
    System.out.println(
        String.format(
            "The number %d, %s", userInputNumber, isPrime ? "is prime." : "is not prime."));
  }

  private static int getUserInput(String message) {
    System.out.println(message);
    return new Scanner(System.in).nextInt();
  }
}
