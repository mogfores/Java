import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c); // chamada da funcao
		showResult(higher);  // chamada da funcao
		
		sc.close();
	}
// criacao dentro do primeiro colchetes
	
	public static int max(int x, int y, int z) { // int: retorno de valor, return aux
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) { // void por nao tem retorno de funcao, apenas imprime da na tela (void)
		System.out.println("Higher = " + value);
	}
}
