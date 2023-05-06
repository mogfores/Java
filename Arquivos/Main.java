import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double valor_peca1, valor_peca2, valor_total;
		
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		valor_peca1 = sc.nextDouble();
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		valor_peca2 = sc.nextDouble();
		
		valor_total = (valor_peca1 * qtd1) + (valor_peca2 * qtd2);
				
		System.out.printf("VALOR A PAGAR: R$ %.2f%n ", valor_total);
			
		sc.close();
		
	}

}
