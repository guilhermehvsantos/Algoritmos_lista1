package lista1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
	
		double n1, n2, n3, p1, p2, p3, media;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite as 3 notas na sequência");
		n1 = teclado.nextDouble();
		n2 = teclado.nextDouble();
		n3 = teclado.nextDouble();
		
		System.out.println("Digite as 3 pesos na sequência");
		p1 = teclado.nextDouble();
		p2 = teclado.nextDouble();
		p3 = teclado.nextDouble();
		
		media = (n1 *p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);
		
		System.out.println("A média ponderada é " + media);
		
		
	}

}
