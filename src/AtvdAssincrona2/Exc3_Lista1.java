package AtvdAssincrona2;

import java.util.Scanner;

public class Exc3_Lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exercicio 3
		int idade;
		String nome;
		boolean primDoacao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("É sua primeira doação? (true/false)");
		primDoacao = leia.nextBoolean();
		
		if(idade >= 18 && idade <= 69) {
			if(idade >= 60 && idade <= 69 && primDoacao == true) {
				System.out.printf("%s não está apte para doar sangue!", nome);
			} else {
				System.out.printf("%s está apte para doar sangue!", nome);
			}
		} else {
			System.out.printf("%s não está apte para doar sangue!", nome);
		}

	}

}
