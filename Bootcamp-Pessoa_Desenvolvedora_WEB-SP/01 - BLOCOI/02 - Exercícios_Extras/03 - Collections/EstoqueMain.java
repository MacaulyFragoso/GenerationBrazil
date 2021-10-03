package org.java.collection;

	/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java
	para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:
	- Armazenar dados da List
	- Remover dados da list;
	- Atualizar dados da list.
	- Apresentar todos os dados da list.*/

	import java.util.Scanner;
	
	public class EstoqueMain {

		private String ferramenta;
		private String categoria;
		private String marca;
		private double preco;
		private int COD;

		public EstoqueMain(String ferramenta, String categoria, String marca, double preco, int COD) {
			this.ferramenta = ferramenta;
			this.categoria = categoria;
			this.marca = marca;
			this.preco = preco;
			this.COD = COD;
		}
		
		public String getFerramenta() {
			return ferramenta;
		}

		public void setFerramenta(String ferramenta) {
			this.ferramenta = ferramenta;
		}

		public String getCategoria() {
			return categoria;
		}
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public Double getPreco() {
			return preco;
		}
		public void setPreco(Double preco) {
			this.preco = preco;
		}
		public int getCOD() {
			return COD;
		}
		public void setCOD(int cod) {
			this.COD = cod;
		}
		
		@Override
		public String toString() {
			return "Estoque{" + "Ferramenta ='" + ferramenta + '\'' + ", Categoria ='" + categoria + '\'' + ", Marca ='" + marca + '\''
					+ ", preÇo =" + preco + ", Código =" + COD + "}\n";
		}
		
		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			EstoqueFerramenta Estoque = new EstoqueFerramenta();
		
				while (true) {
					System.out.print("##--------------------Estoque de Ferramentas-----------------------##\n");
					System.out.print("|___________________________________________________________________|\n");	
					System.out.print("|Selecione uma das opções abaixo:                                   |\n");
					System.out.print("| 1 - Cadastrar Ferramentas.                                        |\n");	
					System.out.print("| 2 - Atualizar Ferramentas.                                        |\n");
					System.out.print("| 3 - Excluir Ferramentas.                                          |\n");
					System.out.print("| 4 - Apresentar Ferramentas Cadastradas.                           |\n");	
					System.out.print("| 5 - Sair.                                                         |\n");
					System.out.print("|___________________________________________________________________|\n");
		
					System.out.print("Opção: ");
					int opcao = scan.nextInt();

					if (opcao == 5) {
						System.out.println("Fechando Estoque.");
						scan.close();
						break;
					}

					switch (opcao) {
					case 1:
						Estoque.cadastrarEstoqueFerramenta();
						break;
					case 2:
						Estoque.atualizarEstoqueFerramenta();
						break;
					case 3:
						Estoque.excluirEstoqueFerramenta();
						break;
					case 4:
						Estoque.apresentarEstoqueFerramenta();
						break;
					default:
						System.out.println("Opcão invalida!");
					}

				}
								
		}
		
}