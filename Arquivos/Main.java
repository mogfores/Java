import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int x;

		x = sc.nextInt();

		while (x >= 0 && x <= 3 || x > 4) {

			if (x == 1) {
				alcool = alcool + 1;
				x = sc.nextInt();
			} else {
				if (x == 2) {
					gasolina = gasolina + 1;
					x = sc.nextInt();
				} else {
					if (x == 3) {
						diesel = diesel + 1;
						x = sc.nextInt();
					} else {
						if (x > 4) {
							x = sc.nextInt();
						}
					}
				}
			}
		}
		sc.close();
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	}
}