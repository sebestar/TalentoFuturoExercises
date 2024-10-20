/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class01.blockone;

public class Exercise08 {

	// [EN] Calculate the Geodesic distance between two coordinates (measured in
	// degrees). Transform coordinates measured in degrees to radians.

	// [ES] Calcule la distancia Geodésica de dos coordenadas (medida en grados).
	// Transforma coordenadas medidas en grados a radianes.
	
	// TODO requires revision.

	public static void main(String[] args) {
		MyCoordinate coordinateA = new MyCoordinate(1, 2);
		MyCoordinate coordinateB = new MyCoordinate(3, 4);
		showGeodesicDistance(coordinateA, coordinateB);
		System.out.println("Good bye!");
	}

	private static void showGeodesicDistance(MyCoordinate coordinateA, MyCoordinate coordinateB) {

		double geodesicDistance = calculateGeodesicDistance(coordinateA, coordinateB);
		displayCoordinatesAB(coordinateA, coordinateB);
		displayGeodesicDistanceResult(geodesicDistance);
	}

	private static double calculateGeodesicDistance(MyCoordinate coordinateA, 
			MyCoordinate coordinateB) {
		return (Math.PI * Math.sqrt(Math
				.pow((coordinateB.getLongitudeRadians() - coordinateA.getLongitudeRadians())
					* Math.cos((coordinateA.getLatitudeRadians() + coordinateB.getLatitudeRadians()) 
							/ 2), 2) 
				+ Math.pow((coordinateB.getLatitudeRadians() - coordinateA.getLatitudeRadians()), 2)));
	}

	private static void displayCoordinatesAB(MyCoordinate coordinateA, MyCoordinate coordinateB) {
		String coordinates = String.format(
				"The coordinates in A is: [latitude=%,.2f rad; longitude=%,.2f rad], "
				+ "B is: [latitude=%,.2f rad; longitude=%,.2f rad]",
				coordinateA.getLatitudeRadians(), coordinateA.getLongitudeRadians(), 
				coordinateB.getLatitudeRadians(), coordinateB.getLongitudeRadians());
		System.out.println(coordinates);
	}

	private static void displayGeodesicDistanceResult(double geodesicDistance) {
		String showResult = String.format("The Geodesic distance is: %,.2f rad", geodesicDistance);
		System.out.println(showResult);
	}

}
