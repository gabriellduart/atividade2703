package exercicios2703;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("Digite o numero do mês: ");
		numero = ler.nextInt();

		if (numero == 1){ 
			System.out.println("O mês é Janeiro");
		}
		else if (numero == 2) {
			System.out.println("O mês é Fevereiro");
		}
		else if (numero == 3) {
			System.out.println("O mês é Março");
		}
		else if (numero == 4) {
			System.out.println("O mês é Abril");
		}
		else if (numero == 5) {
			System.out.println("O mês é Maio");
		}
		else if (numero == 6) {
			System.out.println("O mês é junho");
		}
		else if (numero == 7) {
			System.out.println("O mês é julho");
		}
		else if (numero==8) {
			System.out.println("O mês é Agosto");
		}
		else if (numero==9) {
			System.out.println("O mês é Setembro");
		}
		else if (numero==10) {
			System.out.println("O mês é Outubro");
		}
		else if (numero==11) {
			System.out.println("O mês é Novembro");
		}
		else if (numero==12) {
			System.out.println("O mês é Dezembro");
		}
		else {
			System.out.println("O numero é invalido");
		}
		
		ler.close();

	}

}
