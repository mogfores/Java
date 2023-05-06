import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi, a;
		
		pi = 3.14159;
		raio = sc.nextDouble();
		
		a = Math.pow(raio,2);
		area = pi * a;
		
		System.out.printf("Area = %.4f", area);
			
		sc.close();
		
	}

}
