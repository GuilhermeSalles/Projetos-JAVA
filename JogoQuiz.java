package quiz;

import java.util.Scanner;

public class JogoQuiz {
	static int score;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		score = 0;
		System.out.println("-------------------------------------------");
		System.out.print("Enter Username:");
		String login = sc.nextLine();
		System.out.println("Welcome! " + login + "\n-------------------------------------------\nPronto para jogar?");
		sc.nextLine();
		System.out.println("-------------------------------------------");

		boolean desafio01 = q1();
		if (desafio01) {
			certo();
		} else {
			errado();
		}

		boolean desafio02 = q2();
		if (desafio02) {
			certo();
		} else {
			errado();
		}

		boolean desafio03 = q3();
		if (desafio03) {
			certo();
		} else {
			errado();
		}

		boolean desafio04 = q4();
		if (desafio04) {
			certo();
		} else {
			errado();
		}

		boolean desafio05 = q5();
		if (desafio05) {
			certo();
		} else {
			errado();
		}

		boolean desafio06 = q6();
		if (desafio06) {
			certo();
		} else {
			errado();
		}

		boolean desafio07 = q7();
		if (desafio07) {
			certo();
		} else {
			errado();
		}

		boolean desafio08 = q8();
		if (desafio08) {
			certo();
		} else {
			errado();
		}

		boolean desafio09 = q9();
		if (desafio09) {
			certo();
		} else {
			errado();
		}

		boolean desafio10 = q10();
		if (desafio10) {
			certo();
		} else {
			errado();
		}
		System.out.println("Parabéns " + login + ", voce ficou com " + score + " pontos!");
		sc.close();
	}

	private static boolean q1() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Desafio 01\nQual o formato da terra?\nA - Quadrada\nB - Retangular\nC - Redonda\nD - Plana\nE - Planeta");
		System.out.print("Rsposta: ");
		String resp = sc.nextLine();
		sc.close();
		if (resp.toLowerCase().contentEquals("c")) {
			return true;
		} else {
			return false;
		}
		
	}

	private static boolean q2() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Desafio 02\nQuem descobriu o Brasil?\nA - Guidelicinha\nB - Pedro Álvares Cabral\nC - José\nD - Portugal\nE - Eu porque sou um viajante do Tempo!");
		System.out.print("Rsposta: ");
		String resp = sc.nextLine();
		sc.close();
		if (resp.toLowerCase().contentEquals("b")) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean q3() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Desafio 03\nQuem ganhou a ultima copa do mundo?\nA - Brasil\nB - Russia\nC - São Paulo \nD - Alemanha\nE - America");
		System.out.print("Rsposta: ");
		String resp = sc.nextLine();
		sc.close();
		if (resp.toLowerCase().contentEquals("d")) {
			return true;
		} else {
			return false;
		}

	}

	private static boolean q4() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Desafio 04\nQuem é o ator principal do filme piratas do caribe?\nA - ORLANDO BLOOM\nB - BRENTON THWAITES\nC - Você\nD - GEOFFREY RUSH\nE - JOHNNY DEPP");
		System.out.print("Rsposta: ");
		String resp = sc.nextLine();
		sc.close();
		if (resp.toLowerCase().contentEquals("e")) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean q5() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Desafio 05\ncomplete the answer:My mom is _____, _____, and,____?\nA - Lion,honest,old\nB - Caring,thin,good \nC - young,beatiful,intelligent \nD - Patient,short,tall\nE - energetic,old,light");
		System.out.print("Rsposta: ");
		String resp = sc.nextLine();
		sc.close();
		if (resp.toLowerCase().contentEquals("c")) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean q6() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Desafio 06\nCom quantos anos albert einstein morreu?\nA - 57\nB - 98\nC - 13\nD - 76\nE - 80");
		System.out.print("Rsposta: ");
		String resp = sc.nextLine();
		sc.close();
		if (resp.toLowerCase().contentEquals("d")) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean q7() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Desafio 07\nO teorema de tales foi inventado por quem?\nA - Guilherme Mello\nB - Joãozinho do pastoreiro\nC - Tales de Mileto\nD - caipora\nE - talheres");
		System.out.print("Rsposta: ");
		String resp = sc.nextLine();
		sc.close();
		if (resp.toLowerCase().contentEquals("c")) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean q8() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Desafio 08\nQuem foi o primeiro homem a pisar na lua?\nA - Justin Bieber\nB - Neil Alden Armstrong\nC - Arnold schwarzenegger\nD - Guilherme\nE - Vaca");
		System.out.print("Rsposta: ");
		String resp = sc.nextLine();
		sc.close();
		if (resp.toLowerCase().contentEquals("b")) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean q9() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Desafio 09\nQuem foi o primeiro presidente do brasil?\nA - Dilma\nB - Lula\nC - Temer\nD - Marechal Deodoro\nE - João Rodrigues");
		System.out.print("Rsposta: ");
		String resp = sc.nextLine();
		sc.close();
		if (resp.toLowerCase().contentEquals("d")) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean q10() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Desafio 10\nQual processo do transporte passivo tem a ver com solvente?\nA - Osmose\nB - Bactéria\nC - Carioteca\nD - Virus\nE - Abstinência");
		System.out.print("Rsposta: ");
		String resp = sc.nextLine();
		sc.close();
		if (resp.toLowerCase().contentEquals("a")) {
			return true;
		} else {
			return false;
		}
	}

	private static void certo() {
		System.out.println("Voce acertou!");
		System.out.println("-------------------------------------------");
		score = score + 1;
	}

	private static void errado() {
		System.out.println("Voce errou!!");
		System.out.println("-------------------------------------------");
		score = score - 1;
	}

}