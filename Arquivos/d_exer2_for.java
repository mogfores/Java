//import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int x, i, in, out, valor;
		
		in = 0;
		out = 0;
		valor = 0;
		x = sc.nextInt();

		for (i = 0; i < x; i = i + 1) {
			valor = sc.nextInt();
			if (valor >= 10 && valor <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		sc.close();
		System.out.println(in + " in");
		System.out.println(out + " out");
	}
}
