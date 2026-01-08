package br.com.initial.project;

public class PrimeiraClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá Caio");
		Cliente cliente = new Cliente();
		cliente.cadastrarEndereco("Av Siqueira Campos");
		
		System.out.println(cliente.getEndereco());

	}

}
