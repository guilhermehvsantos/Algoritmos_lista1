package lista1;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		double valorRecebido;
		
		double polegadasPe = 12;
		double pe = 1;
		double jarda = 3 * pe;
		double milha = 1760 * jarda;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor em pés para converter para polegadas, jardas e milhas!");
		valorRecebido = teclado.nextDouble();
		
		double conversaoPolegadas = valorRecebido / polegadasPe;
		double conversaoJardas = valorRecebido / jarda;
		double conversaoMilhas = valorRecebido / milha;
		
		System.out.println("O valor em polegadas é de ");
		System.out.printf("%.2f%n", conversaoPolegadas);
		System.out.println("O valor em jardas é de aproximadamente ");
		System.out.printf("%.2f%n", conversaoJardas);
		System.out.println("O valor em milhas é de aproximadamente ");
		System.out.printf("%.6f%n", conversaoMilhas);
		
		
		

	}

}
