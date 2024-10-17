package cl.sebastian_alejandro.talentofuturoexercises.class01.blockone;

public class MyCilinder {
	private double radio;
	private double height;
		
	public MyCilinder() {
		super();
	}

	public MyCilinder(double radio, double height) {
		super();
		this.radio = radio;
		this.height = height;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLateralArea() {
		return Math.PI * this.radio * this.height * 2;
	}
	
	public double getTotalArea() {
		return Math.PI * this.radio * 2 * (this.height + this.radio);
	}
	
	public double getVolume() {
		return Math.PI * Math.pow(this.radio, 2) * this.height;
	}
	
	@Override
	public String toString() {
		return "MyCilinder [radio=" + radio + ", height=" + height + "]";
	}
	
}
