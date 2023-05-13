import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n, fat;
		int mult;
		n = sc.nextInt();
		mult = 1;

		for (int i = 1; i < n; i++) {

			if (n != 0) {
				mult = mult * i;
			} 
			else {
				System.out.print("1");
			}
		}
		sc.close();
		fat = mult * n;
		System.out.print(fat);
	}
}
