package application;

import java.util.Locale;
import java.util.Scanner;

import entities.student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		student std = new student();
		
		std.name = sc.nextLine();
		std.grade_1 = sc.nextDouble();
		std.grade_2 = sc.nextDouble();
		std.grade_3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f", std.finalGrade());
		std.gradeTest();
		
		
		sc.close();
	}

}
