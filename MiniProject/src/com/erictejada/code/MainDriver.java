package com.erictejada.code;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hi, Please name your thermometer:  ");
		
		String name = in.next();
		
		// this is how Java makes objects!!
		Thermometer obj = new Thermometer();
		obj.setName(name);
		
		System.out.println("Hi, thank you for using " + obj.getName() + " today!");
		
		System.out.println("Please enter your temperature in Celsius:  ");
		int celsius = in.nextInt();
		
		System.out.println("Please enter your temperature in Fahrenheit:  ");
		int fahrenheit = in.nextInt();
		obj.setDegreesC(celsius);
		obj.setDegreesF(fahrenheit);
		
		int resultsF = obj.convertToFahrenheit(celsius);
		int resultsC = obj.convertToCelsius(fahrenheit);
		
		System.out.println("The temperature in " + celsius + " degrees Celsius is " + resultsF + " degrees Fahrenheit.");
		System.out.println("The temperature in " + fahrenheit + " degrees Fahrenheit is " + resultsC + " degrees Celsius.");
		
		System.out.println("please enter three temperatures to calculate average: ");
		int temp1 = in.nextInt();
		int temp2 = in.nextInt();
		int temp3 = in.nextInt();
		
		int[] temps = {temp1, temp2, temp3};
		
		obj.setTempReadings(temps);
		
		obj.calculateAvgTemp(obj.getTempReadings());
		System.out.println("Thanks for using the app. Goodbye!");
		//good to close all input streams like scanner to avoid memory leaks
		in.close();
		
		
	}

}
