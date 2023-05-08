package lista1;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		double salario;
		double deposito;
		double quantidadeCheque = 2;
		
		double cpmf = 1 - (0.38/100);
		
		double saldoInicial = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual foi o valor do seu salario?");
		
		salario = teclado.nextDouble();
		
		deposito = salario / 2 * cpmf;
		
		System.out.println("O valor de cada deposito foi de ");
		System.out.printf("%.2f%n", deposito);
		
		double saldoAtual = deposito * quantidadeCheque;
	
		System.out.println("O valor atual do seu saldo é de ");
		System.out.printf("%.2f", saldoAtual);
		

	}

}
