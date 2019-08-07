package Exercice;

import java.util.Scanner;

public class Areas {
	private static double A = 0;
	private static double B = 0;
	private static double C = 0;
	static double Triangulo, Circulo, Quadrado, Retangulo, Trapezio;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------------------------");
		System.out.println("Insira os números conforme a pergunta");
		System.out.println("-------------------------------------------");

		boolean desafio01 = q1();
		if (desafio01) {
			triangulo();
		} else {
			triangulo();
		}

		boolean desafio02 = q2();
		if (desafio02) {
			circulo();
		} else {
			circulo();
		}

		boolean desafio03 = q3();
		if (desafio03) {
			quadrado();
		} else {
			quadrado();
		}

		boolean desafio04 = q4();
		if (desafio04) {
			retangulo();
		} else {
			retangulo();
		}
		boolean desafio05 = q5();
		if (desafio05) {
			trapezio();
		} else {
			trapezio();
		}
		sc.close();
	}

	private static boolean q1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os numeros para saber a area do triangulo:");
		System.out.print("Número 1:");
		A = sc.nextDouble();
		System.out.print("Número 2:");
		C = sc.nextDouble();
		sc.nextLine();
		return false;
	}

	private static boolean q2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o raio para descobrir a area do circulo:");
		System.out.print("Número 1:");
		A = sc.nextDouble();
		sc.nextLine();
		return false;
	}

	private static boolean q3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os numeros para saber a area do quadrado:");
		System.out.print("Número 1:");
		A = sc.nextDouble();
		System.out.print("Número 2:");
		C = sc.nextDouble();
		sc.nextLine();
		return false;
	}

	private static boolean q4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os numeros para saber a area do retangulo:");
		System.out.print("Número 1:");
		A = sc.nextDouble();
		System.out.print("Número 2:");
		C = sc.nextDouble();
		sc.nextLine();
		return false;
	}

	private static boolean q5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os numeros para saber a area do trapezio:");
		System.out.print("Número 1:");
		A = sc.nextDouble();
		System.out.print("Número 2:");
		B = sc.nextDouble();
		System.out.print("Número 3:");
		C = sc.nextDouble();
		sc.close();
		return false;
	}

	private static void triangulo() {
		Triangulo = A * C / 2.0;
		System.out.println("A área do triangulo :" + Triangulo);
		System.out.println("-------------------------------------------");

	}

	private static void circulo() {
		Circulo = 3.14159 * C * C;
		System.out.println("A área do Circulo :" + Circulo);
		System.out.println("-------------------------------------------");

	}

	private static void quadrado() {
		Quadrado = C * C;
		System.out.println("A área do Quadrado :" + Quadrado);
		System.out.println("-------------------------------------------");

	}

	private static void retangulo() {
		Retangulo = A * C;
		System.out.println("A área do Retangulo :" + Retangulo);
		System.out.println("-------------------------------------------");

	}

	private static void trapezio() {
		Trapezio = (A + B) / 2.0 * C;
		System.out.println("A área do Trapezio :" + Trapezio);
		System.out.println("-------------------------------------------");

	}
}
