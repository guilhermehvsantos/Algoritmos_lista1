package lista1;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		double evento;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do evento em segundos");
		
		evento = teclado.nextDouble();
		
		double horas = evento/3600;
		
		double minutos = evento/60; 
		
		double milissegundos = evento * 1000;
		
		System.out.println("Os Valores desse evento calculado em horas é de ");
		System.out.printf("%.2f%n", horas);
		System.out.println("Os Valores desse evento calculado em minutos é de ");
		System.out.printf("%.2f%n", minutos);
		System.out.println("Os Valores desse evento calculado em milissegundos é de ");
		System.out.printf("%.2f%n", milissegundos);
		

	}

}
