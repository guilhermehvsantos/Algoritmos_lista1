package lista1;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		System.out.println("Qual o ano que você nasceu?");
		
		Scanner teclado = new Scanner(System.in);
		
		double anoNascimento;
		anoNascimento = teclado.nextDouble();
		
		double anoAtual = 2023;
		
		double diasEmUmAno = 365;
		
		double idade = anoAtual - anoNascimento;
		
		double anoFuturo = 2050; 
		
		double diasAteFuturo = (anoFuturo - anoNascimento) * diasEmUmAno;
		
		System.out.println("Você tem " + idade + " anos de idade");
		System.out.println("Você viverá aproximadamente " + diasAteFuturo + " dias até o ano de " + anoFuturo);
		

	}

}
