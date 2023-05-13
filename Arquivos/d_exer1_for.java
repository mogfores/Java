//import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int x, i;

		x = sc.nextInt();

		for (i = 1; i < x; i = i + 1) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		if (x % 2 != 0) {
			System.out.println(x);
		}
		sc.close();
	}
}
