/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class01.blockone;

public class Exercise05 {
	
	// [EN] Convert a measured distance in meters to miles.
	// [ES] Convierta una distancia medida en metros a millas
	
	final static double METER_BY_KILOMETER = 1000.0;
	final static double MILES_BY_KILOMETER = 0.621371192237334;

	public static void main(String[] args) {
		int meters = 5000;
		ShowMetersToMiles(meters);
		System.out.println("Good bye!");
	}

	private static void ShowMetersToMiles(int meters) {
		double miles = convertMetersToMiles(meters);
		displayMetersAndMiles(meters, miles);
	}

	private static double convertMetersToMiles(int meters) {
		double kilometers = meters / METER_BY_KILOMETER;
		return kilometers * MILES_BY_KILOMETER;
	}

	private static void displayMetersAndMiles(int meters, double miles) {
		String displayResult = String.format("Result: %d meters are %,.6f miles", meters, miles);
		System.out.println(displayResult);
	}
}
