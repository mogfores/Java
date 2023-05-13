import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double n, num1, num2;

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			num1 = sc.nextInt();
			num2 = sc.nextInt();

			if (num2 != 0) {
				double div = num1 / num2;
				System.out.print(div);
			} else {
				System.out.print("divisao impossivel");
			}
		}
		sc.close();
	}
}
