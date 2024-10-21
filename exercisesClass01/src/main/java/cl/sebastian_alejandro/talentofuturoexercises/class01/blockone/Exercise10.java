/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class01.blockone;

public class Exercise10 {

  // [EN] Calculate the kinetic energy from an object
  // [ES] Calcule la energía cinética de un objeto

  static final double MASS = 500.0;
  static final double VELOCITY = 100.0;

  public static void main(String[] args) {
    showKineticEnergy();
    System.out.println("Good bye!");
  }

  private static void showKineticEnergy() {
    double kineticEnergy = calculateKineticEnergy(MASS, VELOCITY);
    displayKineticResults(MASS, VELOCITY, kineticEnergy);
  }

  private static void displayKineticResults(double mass, double velocity, double kineticEnergy) {
    String displayResult =
        String.format(
            "The object with mass %,.2f and velocity %,.2f, has a kinetic energy of %,.2f.",
            mass, velocity, kineticEnergy);
    System.out.println(displayResult); 
  }

  private static double calculateKineticEnergy(double mass, double velocity) {
    return ( 1.0/2.0 * mass * Math.pow(velocity, 2));
  }
}
