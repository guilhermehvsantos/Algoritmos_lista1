package lista1;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		System.out.println("Qual é a altura do degrau?E qual altura deseja subir?");
		double degrau;
		double alturaDesejada;
		
		Scanner teclado = new Scanner(System.in);
		
		degrau = teclado.nextDouble();
		alturaDesejada = teclado.nextDouble();
		
		double quantidadeDegraus = alturaDesejada / degrau; 
		
		System.out.println("Você precisa subir " + quantidadeDegraus);
	}

}
