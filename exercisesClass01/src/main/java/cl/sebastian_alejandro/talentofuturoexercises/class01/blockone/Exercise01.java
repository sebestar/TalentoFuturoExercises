package cl.sebastian_alejandro.talentofuturoexercises.class01.blockone;

import java.util.Scanner;

public class Exercise01 {
	
	// [EN] Calculate the area and perimeter of a rectanble.
	// [ES] Calcule el área y perímetro de un rectángulo.

	public static void main(String[] args) {
		calculateAndShowAreaAndPerimeterRectangle();
		System.out.println("Good Bye!");
	}
	
	static void calculateAndShowAreaAndPerimeterRectangle() {
		MyRectangle rectangle = inputRectangleDimensions();
		showAreaAndPerimeterRectangle(rectangle);
	}
	
	static MyRectangle inputRectangleDimensions() {
		Scanner scanner = new Scanner(System.in);
		MyRectangle userInput = new MyRectangle();
		System.out.println("Input the lenght of the rectangle:");
		userInput.setLength(Double.parseDouble(scanner.nextLine()));
		System.out.println("Input the height of the rectangle:");
		userInput.setHeight(Double.parseDouble(scanner.nextLine()));
		return userInput;
	}
	
	static void showAreaAndPerimeterRectangle(MyRectangle rectangle) {
		String result = String.format("The area is %s; the perimeter is %s.", 
				Double.toString(rectangle.getArea()), Double.toString(rectangle.getPerimeter()));
		System.out.println(result);
	}
	
}
