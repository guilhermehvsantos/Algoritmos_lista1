package lista1;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		System.out.println("Qual é o peso do saco em Kg?");
		Scanner teclado = new Scanner(System.in);
		
		double saco;
		saco = teclado.nextDouble();
		
		System.out.println("Qual é o peso da ração em g?");
		double quantidadeRacao;
		quantidadeRacao = teclado.nextDouble();
		
		double dias = 5;
		
		double quantidadeRestante = saco * 1000 - quantidadeRacao * dias;
		
		System.out.println("A quantidade de ração restante depois de " + dias + " é de " + quantidadeRestante);
		

	}

}
