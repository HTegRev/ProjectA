package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Converter {
	
	static double result;
	static double input;
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int menuSelection = 0;
		int subMenuSelection = 0;	
		
		 while(menuSelection != 4) {
		
			try {
				System.out.println("Please select an option");
				System.out.println("1. Length Converter");
				System.out.println("2. Volume Converter");
				System.out.println("3. Mass Converter");
				System.out.println("4. Quit");
				menuSelection = scanner.nextInt();	
				//scanner.nextLine();
				//if(menuSelection < 1 || menuSelection > 4 ) {
				//	System.out.println("Please select from 1 to 4.");
				//	continue;
				//}
				switch(menuSelection) {
				case 1: 
					while (subMenuSelection != 4) {
						System.out.println("Please select an option");
						System.out.println("1. Miles to Kilometers");
						System.out.println("2. Kilometers to Miles");
						System.out.println("3. Meter to Foot");
						System.out.println("4. Return to the main menu");
						subMenuSelection = scanner.nextInt();
						scanner.nextLine();
						switch(subMenuSelection) {
						case 1:
							System.out.println(getValues() + " miles are " + convertMilesToKilometers(input) + " kilometers." );
							break;
						case 2:
							System.out.println(getValues() + " kilometers are " + convertKilometersToMiles(input) + " miles." );
							break;
						case 3:
							System.out.println(getValues() + " meters are " + convertMetersToFoot(input) + " feet");
							break;
						case 4:
							System.out.println("Returning to the main menu.");
							break;
						default:
							System.out.println("Invalid option. Please select from 1 to 4.");							
						}
						System.out.println();
					}
					break;
				case 2:
					while (subMenuSelection != 3) {
						System.out.println("Please select an option");
						System.out.println("1. Galons to Liters");
						System.out.println("2. Liters to Galons");				
						System.out.println("3. Return to the main menu");
						subMenuSelection = scanner.nextInt();
						scanner.nextLine();
						switch(subMenuSelection) {
						case 1:
							System.out.println(getValues() + " gallons are " + convertGalonsToLiters(input) + " liters." );
							break;
						case 2:
							System.out.println(getValues() + " liters are " + convertLitersToGalons(input) + " galons." );
							break;
						case 3:
							System.out.println("Returning to the main menu.");
							break;
						default:
							System.out.println("Invalid option. Please select from 1 to 3.");							
						}
						System.out.println();
					}
					break;
				case 3:
					while (subMenuSelection !=4) {
						System.out.println("Please select an option");
						System.out.println("1. Pounds to Kilogramss");
						System.out.println("2. Kilograms to Pounds");
						System.out.println("3. Ounce to Gram");
						System.out.println("4. Return to the main menu");
						subMenuSelection = scanner.nextInt();
						scanner.nextLine();
						switch(subMenuSelection) {
						case 1:
							System.out.println(getValues() + " pounds are " + convertPoundsToKilograms(input) + " kilograms." );
							break;
						case 2:
							System.out.println(getValues() + " kilograms are " + convertKilogramsToPounds(input) + " pounds." );
							break;
						case 3:
							System.out.println(getValues() + " Ounces are " + convertOuncesToGrams(input) + " grams.");
						case 4:
							System.out.println("Returning to the main menu.");
							break;
						default:
							System.out.println("Invalid option. Please select from 1 to 4.");
							
						}
						System.out.println();
					}
					break;
				case 4:
					System.out.println("Thank you for using the application.");
					break;
					
				default:
					System.out.println("Invalid option. Please select from 1 to 4.");
					
				}	
			}catch(InputMismatchException e) {
				System.out.println("Please use positive integer number.");
				scanner.nextLine();
				
			}
			
		}	
		scanner.close(); 
	}
	public static double getValues()
	{
		System.out.println("Enter the value you want to covert:");
		input = scanner.nextDouble();
		scanner.nextLine();
		return input;
	}
	public static double convertMilesToKilometers(double qty)
	{
		result = qty * 1.60934;
		return result;
	}
	public static double convertKilometersToMiles(double qty)
	{
		result = qty * 0.621371;
		return result;
	}
	public static double convertMetersToFoot(double qty)
	{
		result = qty * 3.28084;
		return result;
	}
	public static double convertGalonsToLiters(double qty)
	{
		result = qty * 3.78541 ;
		return result;
	}
	public static double convertLitersToGalons(double qty)
	{
		result = qty * 0.264172;
		return result;
	}
	public static double convertPoundsToKilograms(double qty)
	{
		result = qty * 0.453592 ;
		return result;
	}
	public static double convertKilogramsToPounds(double qty)
	{
		result = qty * 2.20462;
		return result;
	}
	public static double convertOuncesToGrams(double qty)
	{
		result = qty * 28.3495;
		return result;
	}
}
