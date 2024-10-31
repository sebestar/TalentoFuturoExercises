/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class03.blockone;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Block1Exercise04 {

  // [EN] Get the unique words of a text
  // [ES] Obtenga las palabras únicas de un texto

  static final String TEXT =
      new StringBuilder()
          .append("Just my luck—trapped in a dungeon with no Wi-Fi!\n")
          .append("I really should have read the fine print on that spell!\n")
          .append("That spell executed with a syntax error!\n")
          .append("Don’t forget to save your progress… or you’ll be here for a long time.\n")
          .toString();

  public static void main(String[] args) {
    uniqueWordsFromText();
    System.out.println("Good bye!");
  }

  private static void uniqueWordsFromText() {
    System.out.println("The original text:");
    System.out.println(TEXT);
    String[] uniqueWords = getUniqueWords(TEXT);
    displayResults(uniqueWords);
  }

  private static String[] getUniqueWords(String text) {
    List<String> uniqueWords =
        Arrays.stream(text.toLowerCase().split("\\b(?!n\\b)\\W+"))
            .filter(word -> !word.isEmpty())
            .distinct()
            .collect(Collectors.toList());
    return uniqueWords.stream().toArray(String[]::new);
  }

  private static void displayResults(String[] results) {
    System.out.println("This are the unique words of the text: ");
    StringBuilder display = new StringBuilder();
    display.append("[ ");
    for (int i = 0; i < results.length; i++) {
		if(i%10 == 0 && i != 0) {
			display.append("\n");
		}
      display.append(String.format("%s", results[i]));
      if(i == results.length-1) {
    	  display.append(" ");
      } else {
    	  display.append(", ");
      }
    }
    display.append("]");
    System.out.println(display.toString()); 
  }
}
