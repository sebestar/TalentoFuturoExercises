package cl.sebastian_alejandro.talentofuturoexercises.class01.blockone;

import java.util.Scanner;

public class Exercise03 {

	// [EN] Calculate the area and volume of a cilinder.
	// [ES] Calcule el área y volumen de un cilindro.
	
	public static void main(String[] args) {
		calculateAndShowAreaAndVolumeCilinder();
		System.out.println("Good bye!");
	}

	static void calculateAndShowAreaAndVolumeCilinder() {
		MyCilinder cilinder = inputCilinderDimensions();
		showAreaAndPerimeterCilinder(cilinder);
	}
	
	static MyCilinder inputCilinderDimensions() {
		Scanner scanner = new Scanner(System.in);
		MyCilinder userInput = new MyCilinder();
		System.out.println("Input the radio of the cilinder:");
		userInput.setRadio(Double.parseDouble(scanner.nextLine()));
		System.out.println("Input the height of the cilinder:");
		userInput.setHeight(Double.parseDouble(scanner.nextLine()));
		return userInput;
	}
	
	static void showAreaAndPerimeterCilinder(MyCilinder cilinder) {
		String result = String.format("The lateral area is %s; The total area is %s; The volume is %s.", 
				Double.toString(cilinder.getLateralArea()), Double.toString(cilinder.getTotalArea()), 
				Double.toString(cilinder.getVolume()));
		System.out.println(result);
	}
}
