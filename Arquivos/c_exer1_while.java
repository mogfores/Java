import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int entrada = 0;
		
		while (entrada != 2002) {
			entrada = sc.nextInt();
			if (entrada != 2002) {
				System.out.println("Senha Invalida");
			}
			else {
				System.out.println("Acesso Permitido");
			}
		
		}
		sc.close();
	}					    						
					
}
