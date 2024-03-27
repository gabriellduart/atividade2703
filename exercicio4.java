package exercicios2703;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1,num2,num3;

		System.out.println("digite o primeiro valor");
		num1 = ler.nextInt();

		System.out.println("digite o segundo valor");
		num2 = ler.nextInt();

		System.out.println("digitr o terceiro valor");
		num3 = ler.nextInt();

		if (num1 == num2 && num2 == num3) { 
			System.out.println("O triangulo é equilatero");
		}
		else if (num1 == num2 || num1 == num3 || num2 == num3) {
			System.out.println("O triangulo é isóceles");

		}else {
			System.out.println("O triangulo é escaleno");
		}
		ler.close();
	}

}