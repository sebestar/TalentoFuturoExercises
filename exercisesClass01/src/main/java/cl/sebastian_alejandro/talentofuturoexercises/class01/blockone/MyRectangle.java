/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class01.blockone;

public class MyRectangle {
	
	private double length = 0;
	private double height = 0;
	public MyRectangle() {
		super();
	}
	public MyRectangle(double lenght, double height) {
		this.length = lenght;
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	public double getArea() {
		return this.length * this.height;
	}
	public double getPerimeter() {
		return (this.length + this.height) * 2;
	}
	
	
	@Override
	public String toString() {
		return "MyRectangle [lenght=" + length + ", height=" + height + "]";
	}
}
