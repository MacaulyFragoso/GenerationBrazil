//Package: Organizar Classes Relacionadas:
programa{

	/*Programa: NewMatriz.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #10 - Vetores e Matrizes.
 	 * Exercício 3: Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.*/

	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
		funcao inicio(){

		//Variável = Tipo de Dado + Declaração + Valor, respectivamente.
			inteiro linha, coluna, N1[4][6], N2[4][6], M1[4][6], M2[4][6]

		//Processamento de Dados:
			//Processamento de Dados 1:
				para(linha = 0; linha < 4; linha++){
			
			//Processamento de Dados 2:
				para(coluna = 0; coluna < 6; coluna++){

		//Entrada de Dados:
			//Entrada de Dados 1:
				//Entrada de Dados com o Usuário, com Texto em Bloco.
				escreva("\nDigite os valores para N1: ")
				
				//Para a Leitura dos Dados Inseridos pelo Usuário:
				leia(N1[linha][coluna])

			//Entrada de Dados 2:
				escreva("\nDigite os valores para N2: ") 
				leia(N2[linha][coluna])

			//Processamento de Dados 3:
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna]	
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna]	

			//Saída de Dados 3:
				escreva("\nMatriz M1: ", M1[linha][coluna])

			//Saída de Dados 4:
				escreva("\nMatriz M2: ", M2[linha][coluna])
				
					}
				
				}
				
		}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1180; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */