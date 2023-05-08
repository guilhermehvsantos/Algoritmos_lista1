package lista1;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double cateto1;
		double cateto2;
		System.out.println("Digite o valor do primeiro cateto");
		cateto1 = teclado.nextDouble();
		
		System.out.println("Digite o valor do segundo cateto");
		cateto2 = teclado.nextDouble();
		
		double hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
		System.out.println("O valor da hipotenusa é de " + hipotenusa);
		
		
	}

}
