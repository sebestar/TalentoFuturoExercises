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
import java.util.List;

public class Block2Exercise02 {

  // [EN] Get the unique elements of a list
  // [ES] Obtenga los elementos únicos de una lista

  public static void main(String[] args) {
    List<Integer> numbersList =
        new ArrayList<Integer>(List.of(1, 2, 4, 2, 1, 3, 2, 1, 3, 2, 3, 1, 2, 3, 4));
    System.out.println("The original list is: "); 
    displayNumbers(numbersList);
    
    List<Integer> uniqueNumbers = new ArrayList<Integer>();
    for (Integer number : numbersList) {
      if (!uniqueNumbers.contains(number)) uniqueNumbers.add(number);
    }
    System.out.println("The unique numbers of that list are: "); 
    displayNumbers(uniqueNumbers);
    System.out.println("Good bye!"); 
  }

  private static void displayNumbers(List<Integer> numbers) {
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
}
