/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class04.blockone;

public class Block1Exercise01 {

  // [EN] Recursivity - Compute Factorial
  // [ES] Recursividad - Calculo de Factorial

  static final int NUMBER = 4;

  public static void main(String[] args) {
    computeFactorial(NUMBER);
    System.out.println("Good bye!");
  }

  private static void computeFactorial(int num) {
    System.out.println(String.format("Compute factorial of number %d", num));
    System.out.println(String.format("The result is: %d", factorial(num)));
  }

  private static int factorial(int num) {
    if (num <= 0) {
      return 0;
    } else if (num == 1) {
      return 1;
    } else {
      return num * factorial(num - 1);
    }
  }
}
