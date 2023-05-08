package lista1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		double deposito, juros;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual foi o valor do seu deposito");
		
		deposito = teclado.nextDouble();
		System.out.println("Qual a taxa de juros ? ");
		juros = teclado.nextDouble();
		
		double rendimento = deposito * (juros/100); 
		System.out.println("Seu rendimento é de " + rendimento);
		
		double total = deposito + rendimento;
		System.out.println("Seu total é de " + total);

	}

}
