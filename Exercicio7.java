package lista1;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		 double raio;
		 Scanner teclado = new Scanner(System.in);
		 
		 raio = teclado.nextDouble();
		 
		 double area = Math.sqrt(raio) * Math.PI;
		 double perimetro = 2 * Math.PI * Math.sqrt(raio);
		 
		 System.out.println("A área é de " + area + " e o perímentro é " + perimetro);
		 
	}

}
