package AtvdAssincrona2;

import java.util.Scanner;

public class Exc2_Lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		if(num > 0) {
			System.out.printf("\nO número %d é positivo!", num);
		} else if(num == 0) {
			System.out.printf("\nO número %d é 0!", num);
		} else {
			System.out.printf("\nO número %d é negativo!", num);
		}

	}

}
