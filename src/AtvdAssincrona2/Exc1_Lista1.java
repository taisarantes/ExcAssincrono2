package AtvdAssincrona2;

import java.util.Scanner;

public class Exc1_Lista1 {
	public static void main(String[] args) {
		int num1, num2, num3, soma;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		num3 = leia.nextInt();
		
		soma = num1 + num2;
		
		if(soma > num3) {
			System.out.println("A soma de A + B é maior que C");
		}
	}
}
