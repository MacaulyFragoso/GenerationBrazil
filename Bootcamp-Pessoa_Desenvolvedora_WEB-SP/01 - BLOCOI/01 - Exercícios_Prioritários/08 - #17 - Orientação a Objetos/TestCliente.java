//Package: Organizar Classes Relacionadas.
package org.objetos.orientacao;

	//Classe: Especifica��o de Atributos; Comportamento de Objetos, atrav�s de M�todos.
	public class TestCliente {
		
		public static void main(String[] args) {

		Cliente Informacoes = new Cliente();
		
		Informacoes.setNome("Macauly Fragoso");
		Informacoes.setWhatsApp("(11)99999-9999");
		 
		System.out.println("O nome do cliente �: " + Informacoes.getNome());
		System.out.println("O n�mero de  WhatsApp do cliente �: " + Informacoes.getWhatsApp());
	}
}
