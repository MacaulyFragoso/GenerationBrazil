package org.heranca.polimorfismo;

public class Polimorfismo_Heranca01 {
public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		cachorro.setNome("...");
		cachorro.setIdade("...");
		cavalo.setNome("...");
		cavalo.setIdade("...");
		preguica.setNome("...");
		preguica.setIdade("...");

			System.out.println("\nO nome do cachorro é: " + cachorro.getNome() + ", ele tem " + cachorro.getNome() + " anos e ");
		
			System.out.println("\nO nome do cachorro é" + cavalo.getNome() + ", ele tem " + cavalo.getNome() + " anos e ");
		
			System.out.println("\nO nome do cachorro é" + preguica.getNome()+ ", ele tem " + preguica.getNome() + " anos e ");
	}
}