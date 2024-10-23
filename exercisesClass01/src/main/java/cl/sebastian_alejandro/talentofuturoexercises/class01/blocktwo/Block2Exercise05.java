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

public class Block2Exercise05 {

  // [EN] Determining if a string is palindrome
  // [ES] Determine si una cadena es palíndromo

  public static void main(String[] args) {
    String inputString = getUserInput();
    determinePalindrome(inputString);
    System.out.println("Good bye!");
  }

  private static String getUserInput() {
    System.out.println("Please insert a string: ");
    return new Scanner(System.in).nextLine();
  }

  private static void determinePalindrome(String text) {
    wayOne(text);
  }

  private static void wayOne(String text) {
    System.out.println("Palindrome version one\n");
    String reversedText = new StringBuilder(text).reverse().toString();
    System.out.println(
        text.equals(reversedText) ? "The text is palindrome." : "The text is not palindrome.");
  }
}
