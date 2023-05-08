package lista1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String nome;
		System.out.println("Digite o seu nome");
		nome = teclado.nextLine();
		System.out.println("Digite o seu sálario");
		double salario;
		salario = teclado.nextDouble();
		
		double aumento = 1.25;
		double novoSalario = salario * aumento;
		
		System.out.println("Parabéns " + nome +" teve um aumento de 25% e seu novo saário é de " + novoSalario);
		
	}
	
}
