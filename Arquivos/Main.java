import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n;

		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			
			int i_quadrado = i * i;
			int i_cubo = i * i * i;
			
			System.out.println(i + " " + i_quadrado + " " + i_cubo);
		}
		sc.close();
	}
}