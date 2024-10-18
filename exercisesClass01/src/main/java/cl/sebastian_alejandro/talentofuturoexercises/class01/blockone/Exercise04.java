/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class01.blockone;

import java.util.ArrayList;
import java.util.List;

public class Exercise04 {
	
	// [EN] Calculate the arithmetic and harmonic average between 3 numbers.
	// [ES] Calcule el promedio aritmético y armónico entre 3 números
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>() {{add(3); add(6); add(9);}};
		arithmeticAndArmonicAverage(numbers);
		System.out.println("Good bye!");
	}

	private static void arithmeticAndArmonicAverage(List<Integer> numbers) {
		double arithmeticAverage = calculateArithmeticAverage(numbers);
		double harmonicAverage = calculateHarmonicAverage(numbers);
		displayOriginalNumbers(numbers);
		displayArithmeticAndArmonicAverageResults(arithmeticAverage, harmonicAverage);
	}

	private static void displayOriginalNumbers(List<Integer> numbers) {
		String showResults = String.format("The numbers are: %s", numbers.toString());
		System.out.println(showResults);
	}

	private static void displayArithmeticAndArmonicAverageResults(double arithmeticAverage, 
			double harmonicAverage) {
		String showResults = String.format("Arithmetic Average: %s; Harmonic Average: %s", 
				arithmeticAverage, harmonicAverage);
		System.out.println(showResults);
	}

	private static double calculateHarmonicAverage(List<Integer> numbers) {
		double summation = 0;
		for(Integer number : numbers) {
			summation += number;
		}
		return (summation / numbers.size());
	}

	private static double calculateArithmeticAverage(List<Integer> numbers) {
		double summation = 0;
		for(Integer number : numbers) {
			summation += (1.0/number);
		}
		return (numbers.size() / summation);
	}
	
	
	


}
