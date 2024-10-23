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

public class Block2Exercise06 {

  // [EN] Calculate the factorial of a number
  // [ES] Calcule el factorial de un número

  public static void main(String[] args) {
    int inputNumber = getUserInput();
    getFactorial(inputNumber);
    System.out.println("Good bye!");
  }

  private static void getFactorial(int inputNumber) {
    // remembering: n * (n-1)!
    int result = factorial(inputNumber);
    System.out.println(result); 
  }

  private static int factorial(int inputNumber) { 
	  if(inputNumber > 1) {
		  return inputNumber * factorial(inputNumber-1);
	  }
	  return 1;
  }

  private static int getUserInput() {
    System.out.print("Insert a number: ");
    return new Scanner(System.in).nextInt();
  }
}
