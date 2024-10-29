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

public class Block2Exercise06 {

  // [EN] Validate a series of parentheses
  // [ES] Valide una serie de paréntesis

  static final List<String> SERIES =
      new ArrayList<String>(
          List.of("()", "(())", "(()())", "(()(()()))", ")(", "(()",
              "(()()", ")(())", "", "abc((h)(i) ((j)(*)(k)) )"));

  public static void main(String[] args) {
    String[][] results = validateSeries(SERIES);
    displayResults(results);
    System.out.println("\nGood bye!");
  }

  private static void displayResults(String[][] results) {
	System.out.println("This are the results of the validation: "); 
    for (int i = 0; i < results.length; i++) {
      System.out.println(String.format("%s => %s", results[i][0], results[i][1]));
    }
  }

  private static String[][] validateSeries(List<String> series) {
    String[][] results = new String[series.size()][2];
    for (int i = 0; i < series.size(); i++) {
      String parentheses = series.get(i);
      if (parentheses.isEmpty() || parentheses.isBlank()) {
        results[i][0] = parentheses;
        results[i][1] = "No Parenthesis.";
        continue;
      }
      boolean first = true;
      int counter = 0;
      for (int j = 0; j < parentheses.length(); j++) {
        if (parentheses.charAt(j) == ')' && first) {
          results[i][0] = parentheses;
          results[i][1] = "Invalid";
          break;
        } else if (parentheses.charAt(j) == '(') {
          counter++;
          first = false;
        } else if (parentheses.charAt(j) == ')') {
          counter--;
        }
      }
      if (!first) {
        results[i][0] = parentheses;
        results[i][1] = counter == 0 ? "Valid" : "Invalid";
      }
    }

    /* ¿Qué debemos resolver?
     * Si está vacio el string debe ser específico en el error a SIN PARÉNTESIS
     * El paréntesis inicial siempre debe ser de apertura, si inicia con cierre esta inválido.
     * Las aperturas agregan un contador, los cierres quitan un contador, Si es cero es valido.
     */

    return results;
  }
}
