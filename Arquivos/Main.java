import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, resultado1, resultado2;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		
		if (a < b) {
			resultado1 = b - a;
			System.out.println("O JOGO DUROU " + resultado1 + " HORA(S)");
		}
		else {
			resultado2 = (24 - a) + b;
			System.out.println("O JOGO DUROU " + resultado2 + " HORA(S)");
		}	
	
		sc.close();
	}

}
