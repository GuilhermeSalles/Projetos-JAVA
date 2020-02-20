package main;

import java.util.Scanner;

import entities.Carro;
import entities.Cliente;
import entities.FichaOficina;

public class TesteFicha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cliente cliente;
		Carro carro;
		FichaOficina ficha;
		
		System.out.println("Dados do carro: ");
		System.out.print("Digite a placa do carro: ");
		String placa = sc.nextLine();
		System.out.print("Digite o progresso: ");
		float progresso = sc.nextFloat();
		System.out.print("Digite o modelo do carro: ");
		sc.nextLine();
		String modelo = sc.nextLine();
		
		System.out.println();
		carro = new Carro(placa, progresso, modelo);
		
	    System.out.println("=========================================================");
		
	    System.out.println();
		System.out.println("Dados do Cliente: ");
		System.out.print("Digite o nome do cliente: ");
		String nome = sc.nextLine();
		System.out.print("CPF: ");
		String CPF = sc.nextLine();
		System.out.print("Telefone: ");
		String telefone = sc.nextLine();
		
		
		System.out.println();
		cliente = new Cliente(nome, CPF, telefone, carro);
		
		 System.out.println("=========================================================");
		 
		 System.out.println();
		 System.out.print("Identificador: ");
		 int identificador = sc.nextInt();
		 System.out.print("Problema do carro: ");
		 sc.nextLine();
		 String problema = sc.nextLine();
		 ficha = new FichaOficina(cliente, identificador, problema);
		 
		 
		 System.out.println("=========================================================");
		 ficha.display();
		
		 System.out.println("Progresso está em: ");
		 float pro = sc.nextFloat();
		 cliente.atualizaProgresso(pro);
		 ficha.display();
		 
		sc.close();
	}

}
