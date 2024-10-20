/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class01.blockone;

public class MyCoordinate {

	private double latitude;
	private double longitude;
	
	public MyCoordinate() {
		super();
	}

	public MyCoordinate(double latitude, double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public double getLatitudeRadians() {
		return toRadians(this.latitude);
	}

	public double getLongitudeRadians() {
		return toRadians(this.longitude);
	}
	
	public double toRadians(double grades) {
		return (Math.PI / 180) * grades;
	}
	

	@Override
	public String toString() {
		return "MyCoordinates [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
}
