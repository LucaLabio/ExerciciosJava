package br.com.fiap.exercicio01;
import java.util.Random;
import java.util.Scanner;
public class Programa {
	public static void main(String[] args) {
		Random random = new Random();
		int num1 = 0;
		int num2 = 0;
		
		//soma
		num1 = random.nextInt(100);
		num2 = random.nextInt(100);
		int resultado = num1 + num2;
		System.out.println("Numero 1 = " + num1);
		System.out.println("Numero 2 = " + num2);
		System.out.println("soma = " + resultado);
		
		// subtracao
		num1 = random.nextInt(100);
		num2 = random.nextInt(100);
		resultado = num1 - num2;
		System.out.println("Numero 1 = " + num1);
		System.out.println("Numero 2 = " + num2);
		System.out.println("subtracao = " + resultado);
		
		//modulo
		num1 = random.nextInt(100);
		num2 = random.nextInt(100);
		resultado = num1 % num2;
		System.out.println("Numero 1 = " + num1);
		System.out.println("Numero 2 = " + num2);
		System.out.println("modulo = " + resultado);
		
		//Com dados do usuario
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o primeiro numero");
		num1 = scanner.nextInt();
		System.out.println("Informe o segundo numero");
		num2 = scanner.nextInt();
		resultado = num1 * num2;
		System.out.println("A multiplicacao e " + resultado);
		
		
	}
}
