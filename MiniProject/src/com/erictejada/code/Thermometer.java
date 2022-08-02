package com.erictejada.code;

import java.util.Arrays;

public class Thermometer {
	private int degreesF;
	private int degreesC;
	private String name;
	private int[] tempReadings = new int[3];
	
	//no args constructor = a constructor that can initialize objects, object instances of this class without any parameters for any class fields.
	//these two constructors have the same method name, but they have different number of parameters. aka method overloading. note: method overloading can also occur when there are different datatypes of parameters, but they are the same number of parameters.
	public Thermometer() {
		super(); //tells the jvm that this is an object and therefore it is able to override the object classes methods: Like toString() and hashcode
			
		}
	//al args constructor
	public Thermometer(int degreesF, int degreesC, String name, int[] tempReadings) {
		this.degreesF = degreesF;
		this.degreesC = degreesC;
		this.tempReadings = tempReadings;
		this.name = name;
}
//getters and setters
// these are necessary when we are implementing encapsulation in our java code
// as we need access to our private class fields from our main driver. 
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
	//this is called method overriding, which is another form of encapsulation.
	@Override
	public String toString() {
		return "Thermometer [degreesF=" + degreesF + ", degreesC=" + degreesC + ", name=" + name + ", tempReadings="
				+ Arrays.toString(tempReadings) + "]";
	}
	public static int convertToFahrenheit(int c) {
		
		//(0°C × 9/5) + 32 = 32°F
		return (int)(c  * 1.8 +32);
		
	}
	public static int convertToCelsius(int f){
		
		//(32°F − 32) × 5/9
		return (int)((f - 32) / 1.8);
		
	}
	public static void calculateAvgTemp(int[] temps) {
		//we need a counter for the total temp numbers to start at 0
		int total = 0;
		//iterate thru the array
		for(int i = 0; i < temps.length; i++) {
		//for each temp, add it to the total number
			total +=temps[i];
		}
		//end loop
		
		//return the total temps divided by 3
		//
		System.out.println("the average tempertature of these readings is " + (total/3));
	}
}