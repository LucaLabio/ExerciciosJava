package br.com.fiap.encapsulamento;

public class pessoa {
	private String nome;
	private String email;
	private int idade;
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
		
	}
	public void setEmail (String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
		
	}
	public void setIdade (int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
		
	}
	
	public void falar (String texto) {
		System.out.println(texto);
	}
}
