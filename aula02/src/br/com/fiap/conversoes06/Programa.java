package br.com.fiap.conversoes06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numeroinformadoemstring = "20";
		byte valorByte = Byte.parseByte(numeroinformadoemstring);
		short valorShort = Short.parseShort(numeroinformadoemstring);
		int valorinteiro = Integer.parseInt(numeroinformadoemstring);
		float valorFloat = Float.parseFloat(numeroinformadoemstring);
		double valorDouble = Double.parseDouble(numeroinformadoemstring);
		System.out.println("Resultado sem conversao: " + (numeroinformadoemstring + 1));
		System.out.println("Resultado sem conversao: " + (valorinteiro + 1));
		
		String v1 = String.valueOf(3); // byte
		String v2 = String.valueOf(54);//short
		String v3 = String.valueOf(1000000);//int
		String v4 = String.valueOf(1000000L);//long
		String v5 = String.valueOf(10000.1212D);//double
		String v6 = String.valueOf(100.00f);//float
		String v7 = String.valueOf(true);//boolean
		String v8 = String.valueOf('A');//char sempre com aspas simples
		System.out.println("Exemplo de calculos de valores convertidos para String");
		System.out.println(v1 + v4);
		
		//exemplo de conversao implicita
		int i = 10;
		double d = i;
		
		i= (int)d;
		char c = 'A';
		i = c;
		System.out.println();
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe um numero para ser verificado");
		int x = scanner.nextInt();
		if (x > 10) {
			System.out.println("O valor informado " + x + " eh maior que 10");
		} 
		else if ( x == 10) {
			System.out.println("O valor informado eh exatamente 10");
		}
		else {
			System.out.println("O valor informado " + x + " nao eh maior que 10");
		}
		System.out.println();
		System.out.println("Saiu do if");
		System.out.println("Continua a execucao normalmente");
		
		String numero1informado = JOptionPane.showInputDialog("Informe um numero");
		String numero2informado = JOptionPane.showInputDialog("Informe um numero");
		System.out.println("Escolha uma opcao");
		System.out.println("1 - soma");
		System.out.println("2 - subtracao");
		System.out.println("3 - multiplicacao");
		System.out.println("4 - divisao");
		int opcao = scanner.nextInt();
		int a = Integer.parseInt(numero1informado);
		int b = Integer.parseInt(numero2informado);
		int resultado = 0;
		switch ( opcao ) {
			case 1:
				resultado = a + b;
				break;
			case 2:
				resultado = a - b;
				break;
			case 3:
				resultado = a * b;
				break;
			case 4:
				resultado = a / b;
				break;
			default:
				System.out.println("Voce digitou uma opcao invalida");
				break;
				
		}
		System.out.println("Resultado " + resultado);
		System.out.println("Fim do programa");
	}

}
