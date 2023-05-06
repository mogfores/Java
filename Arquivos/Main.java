import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int number, horas;
		double salario, valor_hora;
		
		number = sc.nextInt();
		horas = sc.nextInt();
		valor_hora = sc.nextDouble();
		
		salario = horas * valor_hora;
				
		System.out.println("NUMBER = " + number);
		System.out.printf("Salary = U$ %.2f%n ", salario);
			
		sc.close();
		
	}

}
