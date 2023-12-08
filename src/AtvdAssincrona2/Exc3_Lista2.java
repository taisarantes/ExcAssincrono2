package AtvdAssincrona2;

import java.util.Scanner;

public class Exc3_Lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exercicio 6
		String nome;
		int cargo;
		float salario, novoSalario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Código --------- Cargo --------- Percentual");
		System.out.println("   1   -----    Gerente    -----    10%");
		System.out.println("   2   -----    Vendedor   -----     7%");
		System.out.println("   3   -----   Supervisor  -----     9%");
		System.out.println("   4   -----   Motorista   -----     6%");
		System.out.println("   5   -----   Estoquista  -----     5%");
		System.out.println("   6   ----- Técnico de TI -----     8%");
		
		System.out.println("\nDigite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("\nDigite o código do seu cargo: ");
		cargo = leia.nextInt();
		
		System.out.println("\nDigite seu salário: ");
		salario = leia.nextInt();
		
		switch(cargo) {
		case 1:
			novoSalario = salario + (salario * 0.1f);
			System.out.printf("Nome do colaborador: %s"
					+ "\nCargo: Gerente "
					+ "\nSalário %.2f", nome, novoSalario);
			break;
		case 2:
			novoSalario = salario + (salario * 0.07f);
			System.out.printf("Nome do colaborador: %s"
					+ "\nCargo: Vendedor "
					+ "\nSalário %.2f", nome, novoSalario);			
			break;
		case 3:
			novoSalario = salario + (salario * 0.09f);
			System.out.printf("Nome do colaborador: %s"
					+ "\nCargo: Supervisor "
					+ "\nSalário %.2f", nome, novoSalario);	
			break;
		case 4:
			novoSalario = salario + (salario * 0.06f);
			System.out.printf("Nome do colaborador: %s"
					+ "\nCargo: Motorista "
					+ "\nSalário %.2f", nome, novoSalario);
			break;
		case 5:
			novoSalario = salario + (salario * 0.05f);
			System.out.printf("Nome do colaborador: %s"
					+ "\nCargo: Estoquista "
					+ "\nSalário %.2f", nome, novoSalario);
			break;
		case 6:
			novoSalario = salario + (salario * 0.08f);
			System.out.printf("Nome do colaborador: %s"
					+ "\nCargo: Técnico de TI "
					+ "\nSalário %.2f", nome, novoSalario);
			break;
		}

	}

}
