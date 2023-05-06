import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double valor;
		int qtd, cod;
		
		cod = sc.nextInt();
		qtd = sc.nextInt();
		
		
		if (cod == 1) {
			valor = qtd * 4.00;
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		else {
			if (cod == 2) {
				valor = qtd * 4.50;
				System.out.printf("Total: R$ %.2f%n", valor);
			}
			else {
				if (cod == 3) {
					valor = qtd * 5.00;
					System.out.printf("Total: R$ %.2f%n", valor);
				    }
					else {
						if (cod == 4) {
							valor = qtd * 2.00;
							System.out.printf("Total: R$ %.2f%n", valor);
						    }
							else {
								valor = qtd * 1.50;
								System.out.printf("Total: R$ %.2f%n", valor);
							}
						 sc.close();
					    }							
					}
				}
			}
        }

        