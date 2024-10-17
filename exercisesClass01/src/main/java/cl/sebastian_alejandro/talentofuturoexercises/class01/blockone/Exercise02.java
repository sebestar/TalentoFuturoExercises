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

public class Exercise02 {
	
	// [EN] Calculate the area and perimeter of a circle.
	// [ES] Calcule el área y perímetro de un circulo.

	public static void main(String[] args) {
		calculateAndShowAreaAndPerimeterCircle();
		System.out.println("Good bye!");
	}

	static void calculateAndShowAreaAndPerimeterCircle() {
		MyCircle circle = inputCircleDimensions();
		showAreaAndPerimeterCircle(circle);
	}
	
	static MyCircle inputCircleDimensions() {
		Scanner scanner = new Scanner(System.in);
		MyCircle userInput = new MyCircle();
		System.out.println("Input the radio of the circle:");
		userInput.setRadio(Double.parseDouble(scanner.nextLine()));
		return userInput;
	}
	
	static void showAreaAndPerimeterCircle(MyCircle circle) {
		String result = String.format("The area is %s; the perimeter is %s.", 
				Double.toString(circle.getArea()), Double.toString(circle.getPerimeter()));
		System.out.println(result);
	}

}
