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
import java.util.Arrays;
import java.util.List;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class Block2Exercise07 {

  // [EN] Randomly shuffle a list
  // [ES] Desordene aleatoriamente una lista

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
    System.out.println(String.format("La lista original es: \n%s", numbers));
    System.out.println(String.format("\nLa lista desordenada es: \n%s\n", shuffleNumbers(numbers)) ); 
    System.out.println("Good bye!");
  }

  private static List<Integer> shuffleNumbers(List<Integer> numbers) {
    int aux;
    RandomGenerator random = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create();
    for (int i = 0; i < numbers.size() - 1; i++) {
      aux = numbers.get(i);
      int selectedNumber = random.nextInt(i + 1, numbers.size());
      numbers.set(i, numbers.get(selectedNumber));
      numbers.set(selectedNumber, aux);
    }
    return numbers;
  }
}
