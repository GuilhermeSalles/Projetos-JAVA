package main;

import java.util.Scanner;

import entities.Carro;
import entities.Cliente;

public class ClienteTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Carro carro;
		Cliente cliente;
		
		
		System.out.println("Dados do carro: ");
		System.out.print("Digite a placa do carro: ");
		String placa = sc.next();
		System.out.print("Digite o progresso: ");
		float progresso = sc.nextFloat();
		System.out.print("Digite o modelo do carro: ");
		String modelo = sc.next();
		
		System.out.println();
		carro = new Carro(placa, progresso, modelo);
		
	    System.out.println("=========================================================");
		
		System.out.println("Dados do Cliente: ");
		System.out.print("Digite o nome do clinete: ");
		String nome = sc.next();
		System.out.print("CPF: ");
		String cPF = sc.next();
		System.out.print("Telefone: ");
		String telefone = sc.next();
		
		
		System.out.println();
		cliente = new Cliente(nome, cPF, telefone, carro);
		
		
		cliente.display();
	
		sc.close();
	}

}
