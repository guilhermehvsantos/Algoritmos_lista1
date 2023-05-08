package lista1;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		double evento;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do evento em dias");
		
		evento = teclado.nextDouble();
		
		double horas = evento*24;
		
		double meses = evento/30; 
		
		double trimestres = evento / (30 * 3);
		
		double semestres = evento / (30 * 6); 
		
		double anos = evento / ( 30 * 12);
		
		double decadas = evento /( 30 * 12 * 10);
		
		System.out.println("Os Valores desse evento calculado em horas é de ");
		System.out.printf("%.2f%n", horas);
		System.out.println("Os Valores desse evento calculado em meses é de ");
		System.out.printf("%.2f%n", meses);
		System.out.println("Os Valores desse evento calculado em trimestres é de ");
		System.out.printf("%.2f%n", trimestres);
		System.out.println("Os Valores desse evento calculado em meses é de ");
		System.out.printf("%.2f%n", semestres);
		System.out.println("Os Valores desse evento calculado em trimestres é de ");
		System.out.printf("%.2f%n", anos);
		System.out.println("Os Valores desse evento calculado em meses é de ");
		System.out.printf("%.2f%n", decadas);

	}

}
