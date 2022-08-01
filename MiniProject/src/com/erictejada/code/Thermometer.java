package com.erictejada.code;

import java.util.Arrays;

public class Thermometer {
	private int degreesF;
	private int degreesC;
	private String name;
	private int[] tempReadings = new int[3];
	
	public Thermometer() {
		super();
			
		}
	
	public Thermometer(int degreesF, int degreesC, String name, int[] tempReadings) {
		this.degreesF = degreesF;
		this.degreesC = degreesC;
		this.tempReadings = tempReadings;
		this.name = name;
}

	public int getDegreesF() {
		return degreesF;
	}

	public void setDegreesF(int degreesF) {
		this.degreesF = degreesF;
	}

	public int getDegreesC() {
		return degreesC;
	}

	public void setDegreesC(int degreesC) {
		this.degreesC = degreesC;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getTempReadings() {
		return tempReadings;
	}

	public void setTempReadings(int[] tempReadings) {
		this.tempReadings = tempReadings;
	}

	@Override
	public String toString() {
		return "Thermometer [degreesF=" + degreesF + ", degreesC=" + degreesC + ", name=" + name + ", tempReadings="
				+ Arrays.toString(tempReadings) + "]";
	}
	public static double convertToFahrenheit(double c) {
		return 5.0 / 9.0 * (convertToCelsius(0) - 32.0);
		
	}
	public static double convertToCelsius(double f){
		return 5.0 / 9.0 * (convertToFahrenheit(0) + 32.0);
		
	}
	public static void calculateAvgTemp(int[] temps) {
		
	}
}