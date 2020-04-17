package br.com.fiap.manipulandostring;

public class Programa {

	public static void main(String[] args) {
		String nome = "Maria";
		int tamanho = nome.length();
		System.out.println(tamanho);
		String frasecomquebra = "Letra \n do alfabeto";
		System.out.println(frasecomquebra);
		String diretorionosistema = "C:\\algo";
		System.out.println(diretorionosistema);
		
		String logradouro = "Rua dos teste";
		String numerocasa = "1111";
		String endereco = logradouro.concat(", ").concat(numerocasa);
		System.out.println(endereco);
		
		if (frasecomquebra.equals(nome)){
			System.out.println("As variaveis sao identicas");
		}
		else {
			System.out.println("As variaveis sao diferentes");
		}
		
		String fiapMaiusculo = "FIAP";
		String fiapMinusculo = "fiap";
		
		if (fiapMinusculo.equalsIgnoreCase(fiapMaiusculo)) {
			System.out.println("as variaveis sao identicas");
		}
		
		String textoD = "Tenha paciencia, existem muitos metodos";
		if (textoD.startsWith("Tenha")) {
			System.out.println("O texto (" + textoD + ") comeca com a palavra \"Tenha\"");
		}
		else {
			System.out.println("O texto nao comeca com a palavra \"Tenha\"");
		}
		if (textoD.endsWith("Tenha")) {
			System.out.println("O texto (" + textoD + ") termina com !");
		}
		else {
			System.out.println("O texto nao termina com !");
		}
		char umCaracterqualquer = textoD.charAt(8);
		System.out.println(umCaracterqualquer);
		
		int posicaoPriemeiraLetra = textoD.indexOf('a');
		System.out.println("A primeira aparencia da letra \"a\" eh na posicao " + posicaoPriemeiraLetra);
		
		int posicaoSequenciaCia = textoD.indexOf("cia");
		System.out.println("a primeira ocorrencia da sequencia (cia) eh na posicao " + posicaoSequenciaCia);
		
		int ultimaocorrenciaA = textoD.lastIndexOf('a');
		System.out.println("A ultima ocorencia da letra a eh na posicao " + ultimaocorrenciaA);
		
		String derivado1 = textoD.substring(10);
		System.out.println(derivado1);
		String derivado2 = textoD.substring(10,15);
		System.out.println(derivado2);
		
		String maiusculo = textoD.toUpperCase();
		System.out.println(maiusculo);
		String minusculo = textoD.toLowerCase();
		System.out.println(minusculo);
		
		String fraseSemPaciencia = textoD.replace("paciencia", "juizo");
		System.out.println(fraseSemPaciencia);
	}
}
