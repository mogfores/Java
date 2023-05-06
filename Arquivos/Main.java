import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, pi, z;
		double area_triangulo, area_circulo, area_trapezio, area_quadrado, area_retangulo;
		pi = 3.14159;
				
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		area_triangulo = (a * c)/2;
		
		z = Math.pow(c,2);
		area_circulo = pi * z;
		
		area_trapezio = (a + b)/2 * c;
		
		area_quadrado = b * b;
		
		area_retangulo = a * b;
		
		System.out.printf(" TRIANGULO: %.3f%n ", area_triangulo);
		System.out.printf("CIRCULO: %.3f%n ", area_circulo);
		System.out.printf("TRAPEZIO: %.3f%n ", area_trapezio);
		System.out.printf("QUADRADO: %.3f%n ", area_quadrado);
		System.out.printf("RETANGULO: %.3f%n ", area_retangulo);
			
		sc.close();
		
	}

}
