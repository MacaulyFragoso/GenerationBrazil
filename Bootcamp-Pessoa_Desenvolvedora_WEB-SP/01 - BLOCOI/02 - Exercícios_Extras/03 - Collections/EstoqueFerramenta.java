package org.java.collection;

	import java.util.Scanner;
	import java.util.ArrayList;

	public class EstoqueFerramenta {
			
		private static final ArrayList<EstoqueMain> Estoque = null;

		public void cadastrarEstoqueFerramenta() {
				
			Scanner read = new Scanner(System.in);
				
			//ArrayList<EstoqueMain> Estoque = new ArrayList<>();

			System.out.println("Quantas ferramentas estamos armazenando? ");
			
			int qtdferramenta = read.nextInt();

			for (int F = 0; F < qtdferramenta; F++) {
					
				System.out.println("\nDigite o nome da " + (F + 1) + "º Ferramenta: ");
				String ferramenta = read.nextLine();
				read.nextLine();
				
				System.out.println("\nDigite a Categoria da " + (F + 1) + "º Ferramenta: ");
				String categoria = read.nextLine();
				
				System.out.println("\nDigite a Marca da " + (F + 1) + "º Ferramenta: ");
				String marca = read.nextLine();

				System.out.println("\nInsira a Preço da " + (F + 1) + "º Ferramenta: ");
				Double preco = read.nextDouble();

				int COD = F;
				
				Estoque.add(new EstoqueMain(ferramenta, categoria, marca, preco, COD));
				
				read.close();
			}
			
		}	
			
			
		public void atualizarEstoqueFerramenta() {
			
			Scanner read = new Scanner(System.in);
			
			System.out.println("\nDigite o Código da Ferramenta que iremos atualizar: ");
			int getAtualizar = read.nextInt();

			Estoque.remove(getAtualizar);
				
				System.out.println("\nAltere o nome da Ferramenta: ");
				String ferramenta = read.nextLine();
			
				System.out.println("\nAltere a Categoria da Ferramenta: ");
				String categoria = read.nextLine();
			
				System.out.println("\nAltere a Marca da Ferramenta: ");
				String marca = read.nextLine();

				System.out.println("\nAltere a Preço da Ferramenta: ");
				Double preco = read.nextDouble();

				System.out.println("\nAltere o Código da Ferramenta: ");
				int COD = read.nextInt();
	
			Estoque.add(getAtualizar, new EstoqueMain(ferramenta, categoria, marca, preco, COD));

				System.out.println("\nA Ferramenta de Código: " + getAtualizar + " foi atualizda!");
				
				read.close();
			
		}		
				
		public void excluirEstoqueFerramenta() {
			
			Scanner read = new Scanner(System.in);
			
			System.out.println("\nDigite o Código da Ferramenta que iremos remover: ");
			int getCOD = read.nextInt();

			Estoque.remove(getCOD);
			
			System.out.println("\nA Ferramenta de Código: " + getCOD + " foi removida!");
			
			read.close();
		}					
				
				
		public void apresentarEstoqueFerramenta() {	

			Scanner read = new Scanner(System.in);
			
			System.out.println("A lista completa de Ferramentas é: ");
			
			for (EstoqueMain F : Estoque) {
				System.out.print(F);
			}

			System.out.println("\nEstoque de Ferramentas: " + Estoque.size());

			read.close();
			
		}
		
}