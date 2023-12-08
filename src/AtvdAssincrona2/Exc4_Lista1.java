package AtvdAssincrona2;

import java.util.Scanner;

public class Exc4_Lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exercicio 4
		String palavra1, palavra2, palavra3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("É invertebrado ou vertebrado?");
		palavra1 = leia.nextLine();
		
		if(palavra1.equals("vertebrado")) {
			System.out.println("É ave ou mamífero?");
			palavra2 = leia.nextLine();
			
			if(palavra2.equals("ave")) {
				System.out.println("É carnívoro ou onívoro?");
				palavra3 = leia.nextLine();
				if(palavra3.equals("carnivoro")) {
					System.out.println("É uma águia!");
				} else {
					System.out.println("É uma pomba!");
				}
				
			} else {
				System.out.println("É onívoro ou herbívoro?");
				palavra3 = leia.nextLine();
				if(palavra3.equals("onivoro")) {
					System.out.println("É um homem!");
				} else {
					System.out.println("É uma vaca!");
				}
				
			}
			
		} else {
			System.out.println("É inseto ou anelídeo?");
			palavra2 = leia.nextLine();
			if(palavra2.equals("inseto")) {
				System.out.println("É um hematófago ou um herbívoro?");
				palavra3 = leia.nextLine();
				if(palavra3.equals("hematofago")) {
					System.out.println("É uma pulga!");
				} else {
					System.out.println("É uma lagarta!");
				}
				
			} else {
				System.out.println("É um hematófago ou um onívaro?");
				palavra3 = leia.nextLine();
				if(palavra3.equals("hematofago")) {
					System.out.println("É uma sanguessuga!");
				} else {
					System.out.println("É uma minhoca!");
				}
			}
		}
	}

}
