package lista1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		double base, altura;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite os valores da base e da altura do seu triangulo respectivamente!");
		
		base = teclado.nextDouble();
		altura = teclado.nextDouble();
		
		double area = base * altura / 2;
		
		System.out.println("A área deste triangulo é de " + area);

	}

}
