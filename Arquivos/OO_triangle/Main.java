import java.util.Locale;
import java.util.Scanner;

import entitites.Triangle;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// PROGRAMA SEM ORIENTAÇÃO A OBJETOS

		Scanner sc = new Scanner(System.in);

		// Essa declaração será apagada para criar as variaveis x e y do tipo Triangle
		// double xA, xB, xC, yA, yB, yC;

		Triangle x, y; // agora é preciso importar a classe do pacote entities

		// para usar o objeto, para que ele exista, é preciso instanciar, criar o objeto

		x = new Triangle();
		y = new Triangle();

		// agora como eu faço para ler um numero inteiro e guardar no atributo A do
		// objeto X?
		// basta adicinar x.(atributo que se quer acessar)

		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		/*
		 * Trocar toda a lógica de cálculo para a chamada da função da classe area
		 * double p = (x.a + x.b + x.c)/2; double area_x = Math.sqrt(p*(p - x.a)*(p -
		 * x.b)*(p - x.c));
		 */

		double area_x = x.area();

		/*
		 * Mesma situação faz com y p = (y.a + y.b + y.c)/2; double area_y =
		 * Math.sqrt(p*(p - y.a)*(p - y.b)*(p - y.c));
		 */

		double area_y = y.area();

		System.out.printf("Triangle X area: %.4f%n", area_x);
		System.out.printf("Triangle Y area: %.4f%n", area_y);

		if (area_x > area_y) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}

		sc.close();

	}
}
