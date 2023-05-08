package lista1;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		double multa1 = 0.02;
		double multa2 = 0.035;
		
		double conta1;
		double conta2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite os valores das contas a pagar respectivamente");
		
		conta1 = teclado.nextDouble();
		conta2 = teclado.nextDouble();
		
		System.out.println("Informe o salario");
		
		double salario = teclado.nextDouble();
		
		double contaPaga1 = conta1 * (1+multa1);
		double contaPaga2 = conta2 * (1+multa2);
		
		double totalRestante = salario - contaPaga1 - contaPaga2;
		System.out.println("Os valores a serem pagos serão ");
		System.out.printf("%.2f%n", contaPaga1);
		System.out.println(" da primeira conta e ");
		System.out.printf("%.2f%n", contaPaga2);
		System.out.println(" da segunda conta ");
		System.out.println("O valor restante é de " + totalRestante);
	}

}
