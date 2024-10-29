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
import java.util.stream.Collectors;

public class Block2Exercise04 {

  // [EN] Get the intersection between two lists of numbers
  // [ES] Obtenga la intersección entre dos listas de números

  public static void main(String[] args) {
    List<Integer> listOne = new ArrayList<Integer>(List.of(1, 6, 5, 4, 3, 2, 7));
    List<Integer> listTwo = new ArrayList<Integer>(List.of(7, 4, 5, 8, 9, 10, 11));
    System.out.println("The first list is: ");
    displayNumbers(listOne);
    System.out.println("The second list is: ");
    displayNumbers(listTwo);

    List<Integer> intersection =
        listOne.stream()
            .filter((number) -> listTwo.contains(number))
            .collect(Collectors.toCollection(ArrayList::new));
    System.out.println("\nThe intersection between the list is: ");
    displayNumbers(intersection);
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
