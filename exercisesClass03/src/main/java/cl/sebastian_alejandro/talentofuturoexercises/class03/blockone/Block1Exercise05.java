/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class03.blockone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Block1Exercise05 {

  // [EN] Get the frecuency of appearance of words in a string
  // [ES] Obtenga la frecuencia de aparicion de las palabras en una cadena

  static final String TEXT =
      new StringBuilder()
          .append("Just my luck—trapped in a dungeon with no Wi-Fi!\n")
          .append("I really should have read the fine print on that spell!\n")
          .append("That spell executed with a syntax error!\n")
          .append("Don’t forget to save your progress… or you’ll be here for a long time.\n")
          .toString();

  public static void main(String[] args) {
    frecuencyWordAppearancesFromText();
    System.out.println("Good bye!");
  }

  private static void frecuencyWordAppearancesFromText() {
    System.out.println("The original text:");
    System.out.println(TEXT);
    String[][] frecuency = computeFrecuencyWordAppearances(TEXT);
    displayResults(frecuency);
  }

  private static String[][] computeFrecuencyWordAppearances(String text) {
    String[] wordAppearances = getWords(text);
    String[] uniqueWords = getUniqueWords(text);
    String[][] frecuency = new String[uniqueWords.length][2];

    for (int i = 0; i < uniqueWords.length; i++) {
      int amount = 0;
      for (int j = 0; j < wordAppearances.length; j++) {
        if (uniqueWords[i].equals(wordAppearances[j])) amount++;
      }
      frecuency[i][0] = uniqueWords[i];
      frecuency[i][1] = String.valueOf(amount);
    }
    return frecuency;
  }

  private static String[] getWords(String text) {
    List<String> uniqueWords =
        Arrays.stream(text.toLowerCase().split("\\b(?!n\\b)\\W+"))
            .filter(word -> !word.isEmpty())
            .collect(Collectors.toList());
    return uniqueWords.stream().toArray(String[]::new);
  }

  private static String[] getUniqueWords(String text) {
    List<String> uniqueWords =
        Arrays.stream(text.toLowerCase().split("\\b(?!n\\b)\\W+"))
            .filter(word -> !word.isEmpty())
            .distinct()
            .collect(Collectors.toList());
    return uniqueWords.stream().toArray(String[]::new);
  }

  private static void displayResults(String[][] results) {
    System.out.println("This are the results: ");
    for (int i = 0; i < results.length; i++) {
      System.out.println(String.format("%s => %s", results[i][0], results[i][1]));
    }
  }
}
