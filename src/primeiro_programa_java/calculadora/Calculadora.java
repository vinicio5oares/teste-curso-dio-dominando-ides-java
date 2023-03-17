package primeiro_programa_java.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor:");		
		a = scan.nextInt();
		
		
		System.out.println("Digite o segundo valor:");
		b = scan.nextInt();
		
		
		double soma = soma(a,b);
		double subtracao = subtracao(a, b);
		double multiplicacao = multiplicacao(a, b);
		double divisao = divisao(a, b);
		
		System.out.println("soma = " + soma);
		System.out.println("subtracao = " +subtracao);
		System.out.println("ultiplicacao = " + multiplicacao);
		System.out.println("divisao = " + divisao);
		
		
		
	}
	public static double soma(double a, double b) {
		return a + b;
	}
	public static double subtracao(double a, double b) {
		return a - b;
	}
	public static double divisao(double a, double b) {
		return a / b;
	}
	public static double multiplicacao(double a, double b) {
		return a * b;
	}
}