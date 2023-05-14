import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		//String word1 = vect[0];
		//String word2 = vect[1];
		//String word3 = vect[2];
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		sc.close();
	}
}
