package main;

import java.util.Scanner;

import entities.Carro;

public class CarroTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Carro carro;
		
		System.out.println("Dados do carro: ");
		System.out.print("Digite a placa do carro: ");
		String placa = sc.next();
		System.out.print("Digite o progresso: ");
		float progresso = sc.nextFloat();
		System.out.print("Digite o modelo do carro: ");
		String modelo = sc.next();
		
		System.out.println();
		carro = new Carro(placa, progresso, modelo);
		
		
		carro.display();
	
		sc.close();
	}

}
