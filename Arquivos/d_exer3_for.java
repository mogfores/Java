import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int x;
				
		x = sc.nextInt();
	

		for (int i = 0; i < x; i++) {
			
			double val_1 = sc.nextDouble();
			double val_2 = sc.nextDouble();
			double val_3 = sc.nextDouble();
			
			double media = (val_1 * 2 + val_2 * 3 + val_3 * 5) / 10;
			
			System.out.printf("%.1f%n", media);
			
		}
		
		
		sc.close();
		
		
		
	}
}
