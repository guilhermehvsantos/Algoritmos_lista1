package lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double bruto;
		System.out.println("Qual é seu salario bruto");
		bruto = teclado.nextDouble();
		
		double gratificacao = 1.10;
		double desconto = 0.85;
		double liquido = bruto * gratificacao * desconto;
		
		System.out.println("Seu salario liquido é de " + liquido);
		

	}

}
