/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class01.blockone;

import java.awt.Point;
import java.nio.file.StandardCopyOption;

public class Exercise07 {

	// [EN] Calculate the Euclidean distance between two coordinates (measures in degrees)
	// [ES] Calcule la distancia Euclidiana entre dos coordenadas (medidas en grados)
	
	public static void main(String[] args) {
		Point coordinateA = new Point(2, 5);
		Point coordinateB = new Point(7, 9);
		showEuclideanDistance(coordinateA, coordinateB);
		System.out.println("Good bye!");
	}

	private static void showEuclideanDistance(Point coordinateA, Point coordinateB) {
		double distance = calculateEuclideanDistance(coordinateA, coordinateB);
		displayCoordinatesAB(coordinateA, coordinateB);
		displayEuclideanDistanceResult(distance);
	}

	private static double calculateEuclideanDistance(Point coordinateA, Point coordinateB) {
		return Math.sqrt(Math.pow(coordinateA.getX()-coordinateB.getX(), 2) +
				Math.pow(coordinateA.getY()-coordinateB.getY(), 2));
	}
	
	private static void displayCoordinatesAB(Point coordinateA, Point coordinateB) {
		String coordinates = String.format("The coordinate A is [x=%,.2f;y=%,.2f]. "
				+ "The coordinate B is [x=%,.2f;y=%,.2f].", 
				coordinateA.getX(), coordinateA.getY(), coordinateB.getX(), coordinateB.getY());
		System.out.println(coordinates);
	}

	private static void displayEuclideanDistanceResult(double distance) {
		String showResult = String.format("The euclidean distance is: %,.2f", distance);
		System.out.println(showResult);
	}
}
