/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class01.blocktwo;

public class Block2Exercise02 {

  // [EN] The famous "Fizz Buzz"
  // [ES] El famoso "Fizz Buzz"

  public static void main(String[] args) {
    doFizzBuzz();
    System.out.println("Good Bye");
  }

  private static void doFizzBuzz() {
    StringBuilder result = new StringBuilder();
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        result.append("fizzbuzz ");
      } else if (i % 3 == 0) {
        result.append("fizz ");
      } else if (i % 5 == 0) {
        result.append("buzz ");
      } else {
        result.append(String.format("%d ", i));
      }
      if(i %8 == 0) {
    	result.append("\n");
      }
    }
    System.out.println(result);
  }
}
