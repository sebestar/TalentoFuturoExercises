/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class01.blocktwo;

public class Block2Exercise07 {

  // [EN] Calculate the Fibonacci secuence.
  // [ES] Calcule la serie Fibonacci

  public static void main(String[] args) {
	  // remembering Fibonacci: 0,1,1,2,3,5,8,13,21,34
	  int lastCounter = 8;
	  printFibonacci(lastCounter);
	  System.out.println("Good bye!"); 
  }

private static void printFibonacci(int lastCounter){
	System.out.println("The fibonacci secuence.\n");
	int positionA = 1;
	int positionB = 0;
	int toPrintAux = 0;
	StringBuilder result = new StringBuilder(Integer.toString(toPrintAux));
	while(lastCounter-- >= 1) {
		result.append(", ");
		toPrintAux = positionA + positionB;
		positionA = positionB;
		positionB = toPrintAux;
		result.append(toPrintAux);
	}
	result.append(".");
	System.out.println(result.toString()); 
}
}
