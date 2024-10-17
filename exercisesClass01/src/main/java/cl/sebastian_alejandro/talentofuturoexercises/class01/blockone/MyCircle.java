/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class01.blockone;

public class MyCircle {
	private double radio;

	public MyCircle() {
		super();
	}

	public MyCircle(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}
	
	public double getPerimeter() {
		return Math.PI * this.radio * 2;
	}	
	
	@Override
	public String toString() {
		return "MyCircle [radio=" + radio + "]";
	}
	
	
}
