package lista1;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

				double a;
				double b;
				double c;
				
				
				Scanner teclado = new Scanner(System.in);
				System.out.println("Digite os valores respectivamente de a, b e c");
				a = teclado.nextDouble();
				b = teclado.nextDouble();
				c = teclado.nextDouble();
				
				
				double delta = b * b  - 4 * a * c;
				
				 double x = ((- b)* (Math.sqrt(delta)) / 2* a);
				 
				 System.out.println("O resultado da equação de " +a +"x² "+ b +"x " + c +" = " + x);
				 

			}

	}


