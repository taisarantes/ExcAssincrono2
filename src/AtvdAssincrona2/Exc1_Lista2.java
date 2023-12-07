package AtvdAssincrona2;

import java.util.Scanner;

public class Exc1_Lista2 {
	public static void main(String[] args) {
		int produto, quantidade, valorTotal, preco = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Código -----     Produto     ----- Preço Und");
		System.out.println("   1   ----- Cachorro Quente -----  R$ 10.00");
		System.out.println("   2   -----     X-Salada    -----  R$ 15.00");
		System.out.println("   3   -----     X-Bacon     -----  R$ 18.00");
		System.out.println("   4   -----      Bauru      -----  R$ 12.00");
		System.out.println("   5   -----   Refrigerante  -----  R$  8.00");
		System.out.println("   6   ----- Suco de Laranja -----  R$ 13.00");
		
		System.out.println("Digite o código do produto: ");
		produto = leia.nextInt();
		
		System.out.println("Digite a quantidade que você quer comprar: ");
		quantidade = leia.nextInt();
		
		valorTotal = quantidade * preco;
		
		switch(produto) {
		case 1:
			valorTotal = quantidade * 10;
			System.out.printf("Produto: Cachorro quante \nValor total: R$ %d", valorTotal);
			break;
		case 2:
			valorTotal = quantidade * 15;
			System.out.printf("Produto: X-Salada \nValor total: R$ %d", valorTotal);
			break;
		case 3:
			valorTotal = quantidade * 18;
			System.out.printf("Produto: X-Bacon \nValor total: R$ %d", valorTotal);
			break;
		case 4:
			valorTotal = quantidade * 12;
			System.out.printf("Produto: Bauru \nValor total: R$ %d", valorTotal);
			break;
		case 5:
			valorTotal = quantidade * 8;
			System.out.printf("Produto: X-Salada \nValor total: R$ %d", valorTotal);
			break;
		case 6:
			valorTotal = quantidade * 13;
			System.out.printf("Produto: Suco de Laranja \nValor total: R$ %d", valorTotal);
			break;
		}
	}
}
