package lista1;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual é o valor de referencia?");
		double valorReferencia;
		valorReferencia = teclado.nextDouble();
		
		double cadaKw = valorReferencia * 1/5;
		
		System.out.println("Qual é o valor dp seu consumo?");
		double consumo;
		consumo = teclado.nextDouble();
		
		double valorResidencia = cadaKw * consumo;
		double pagoBonus = valorResidencia * 0.83;
		double pagoAtrasado = valorResidencia * (10 * 0.5 / 100) + valorResidencia; 
		
		System.out.println("Você consumiu " + consumo + " deve pagar " + valorResidencia + " com o bonus seria " + pagoBonus + "e com atraso de 10 dias " + pagoAtrasado);
	
		
	}

}
