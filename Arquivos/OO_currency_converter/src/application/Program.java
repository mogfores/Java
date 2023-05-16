package application;

import java.util.Locale;
import java.util.Scanner;

import entities.currencyconverter;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		currencyconverter std = new currencyconverter();
		
		System.out.println("What is the dollar price? ");
		std.price = sc.nextDouble();
		System.out.println("How many dollares will be bought? ");
		std.how_many = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais: %.2f", std.amount());
		
		
		sc.close();

	}

}
