package AtvdAssincrona2;

import java.util.Scanner;

public class Exc2_Lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exercicio 7
		int opcao, num1, num2, soma, sub, mult, divi;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Código ----- Operação");
		System.out.println("   1   ----- Soma     ");
		System.out.println("   2   ----- Subtração   ");
		System.out.println("   3   ----- Multiplicação");
		System.out.println("   4   ----- Divisão");
		
		System.out.println("\nDigite o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextInt();
		
		System.out.println("Digite o código da operação: ");
		opcao = leia.nextInt();
		
		switch(opcao) {
		case 1:
			soma = num1 + num2;
			System.out.printf("%d + %d = %d", num1, num2, soma);
			break;
		case 2:
			sub = num1 - num2;
			System.out.printf("%d - %d = %d", num1, num2, sub);
			break;
		case 3:
			mult = num1 * num2;
			System.out.printf("%d * %d = %d", num1, num2, mult);
			break;
		case 5:
			divi = num1 / num2;
			System.out.printf("%d / %d = %d", num1, num2, divi);
			break;
		default:
			System.out.println("Operação inválida!");
		}

	}

}
