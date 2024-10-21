/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class01.blockone;

public class MySecondsMinutesHours {

  private int totalSeconds = 0;

  public MySecondsMinutesHours() {
    super();
  }

  public MySecondsMinutesHours(int totalSeconds) {
    super();
    this.totalSeconds = totalSeconds;
  }

  public int getTotalSeconds() {
    return totalSeconds;
  }

  public void setTotalSeconds(int totalSeconds) {
    this.totalSeconds = totalSeconds;
  }

  public int getSeconds() {
    return this.totalSeconds - (getHours() * 3600) - (getMinutes() * 60);
  }

  public int getMinutes() {
    int remainingSeconds = this.totalSeconds - (getHours() * 3600);
    return remainingSeconds / 60;
  }

  public int getHours() {
    return totalSeconds / 3600;
  }
}
