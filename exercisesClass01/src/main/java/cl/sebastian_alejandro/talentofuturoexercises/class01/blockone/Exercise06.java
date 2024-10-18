/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class01.blockone;

// [EN] Convert a temperature measured in Celsius to Fahrenheit
// [ES] Convierta una temperatura medida en Celsius a Fahrenheit

public class Exercise06 {

	public static void main(String[] args) {
		double celcius = 27.0;
		ShowCelciusToFahrenheit(celcius);
		System.out.println("Good bye!");
	}

	private static void ShowCelciusToFahrenheit(double celcius) {
		double fahrenheit = calculateCelciusToFahrenheit(celcius);
		displayCelciusToFahrenheitResults(celcius, fahrenheit);
	}

	private static double calculateCelciusToFahrenheit(double celcius) {
		return (celcius * 1.8) + 32;
	}
	
	private static void displayCelciusToFahrenheitResults(double celcius, double fahrenheit) {
		String showResults = String.format("Result: %,.2f(°C) degrees Celcius are %,.2f(°F) degrees Fahrenheit.", 
				celcius, fahrenheit);
		System.out.println(showResults);
	}
	

}
