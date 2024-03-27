package exercicios2703;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String cpf,senha;
		double valor,saldof;

		System.out.println("Digite seu CPF");
		cpf = ler.nextLine();

		if(cpf.equals("48683399826")) {
			System.out.println("Digite sua senha");
			senha = ler.nextLine();
			if(senha.equals("12345678")) {
				System.out.println("Saldo atual é 150");
				System.out.println("Qaual valor deseja sacar?");
				valor = ler.nextDouble();
				if (valor <= 150) {
					saldof= 150 - valor;
					System.out.println("saldo atualizado, valor correspondente é " + saldof);
				}else {
					System.out.println("Saldo insuficiente");
				}
			}else {
				System.out.println("Senha incorreta");
			}
		}else {
			System.out.println("cpf errado");
		}ler.close();


	}


}


