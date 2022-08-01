package com.erictejada.code;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
		Thermometer NewThermometer = new Thermometer(0,0,null, new int[3]);
		Scanner user = new Scanner(System.in);
		System.out.println("hi, please name the thermometer");
		
		String str = user.nextLine();
				System.out.println(str);
		System.out.println("Enter Fahrenheit here: ");
		int i = user.nextInt();
		NewThermometer.setDegreesF(i);
		
		System.out.println("Enter Celcius here: ");
		int l = user.nextInt();
		NewThermometer.setDegreesC(l);
		
		
	}

}
