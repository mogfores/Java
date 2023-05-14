package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		Rectangle x = new Rectangle();
		
		System.out.println("Enter rectangle width and leight: ");
		x.height = sc.nextDouble();
		x.width = sc.nextDouble();
		
		double areax = x.area();
		double perimeterx = x.perimeter();
		double diagonalx = x.diagonal();
		
		System.out.printf("AREA = %.2f%n", areax);
		System.out.printf("PERIMETER = %.2f%n", perimeterx);
		System.out.printf("DIAGONAL = %.2f%n", diagonalx);
		
		sc.close();
	}

}
