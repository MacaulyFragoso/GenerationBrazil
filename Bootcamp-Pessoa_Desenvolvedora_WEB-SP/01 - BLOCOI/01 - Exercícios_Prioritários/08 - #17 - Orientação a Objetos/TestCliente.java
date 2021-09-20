//Package: Organizar Classes Relacionadas.
package org.objetos.orientacao;

	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos.
	public class TestCliente {
		
		public static void main(String[] args) {

		Cliente Informacoes = new Cliente();
		
		Informacoes.setNome("Macauly Fragoso");
		Informacoes.setWhatsApp("(11)99999-9999");
		 
		System.out.println("O nome do cliente é: " + Informacoes.getNome());
		System.out.println("O número de  WhatsApp do cliente é: " + Informacoes.getWhatsApp());
	}
}
