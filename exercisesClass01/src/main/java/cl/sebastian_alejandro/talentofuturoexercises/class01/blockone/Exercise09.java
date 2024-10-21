/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class01.blockone;

import java.util.Scanner;

public class Exercise09 {

  // [EN] Convert a number of seconds to its representation in hours, minutes and seconds.
  // [ES] Convierta una cantidad de segundos a su representación en horas, minutos y segundos.

  static final int SECONDS_BY_MINUTES = 60;
  static final int SECONDS_BY_HOURS = 3600;

  public static void main(String[] args) {
    int userInputSeconds = userInputSeconds();
    showSecondsMinutesAndSeconds(userInputSeconds);
    System.out.println("Good bye!");
  }

  private static int userInputSeconds() {
    System.out.println("Input the number of seconds: ");
    return new Scanner(System.in).nextInt();
  }

  private static void showSecondsMinutesAndSeconds(int seconds) {
    MySecondsMinutesHours secondsTransform = new MySecondsMinutesHours(seconds);
    String result =
        String.format(
            "El total de segundos son %d.\nSu representación es: "
                + "%d horas, %d minutos y %d segundos",
            seconds,
            secondsTransform.getHours(),
            secondsTransform.getMinutes(),
            secondsTransform.getSeconds());
    System.out.println(result);
  }
}
