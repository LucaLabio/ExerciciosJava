package br.com.fiap.encapsulamento;

public class programa {

	public static void main(String[] args) {
		pessoa pessoa = new pessoa();
		pessoa.setNome("Giugismos");
		pessoa.setEmail("Giugismos@gmail.foda");
		pessoa.setIdade(2020);
		System.out.println(pessoa.getNome() + " " + pessoa.getEmail() + " " + pessoa.getIdade());
	}

}
