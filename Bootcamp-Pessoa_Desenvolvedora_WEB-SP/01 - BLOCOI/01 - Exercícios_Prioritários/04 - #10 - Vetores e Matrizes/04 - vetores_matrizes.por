//Package: Organizar Classes Relacionadas:
programa{

	/*Programa: NumGam.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #10 - Vetores e Matrizes.
 	 * Exercício 4: Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores dela e a soma
 	   dos valores da primeira diagonal, ou seja, diagonal principal.*/

 	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
		funcao inicio(){

		//Variável = Tipo de Dado + Declaração + Valor, respectivamente:
			inteiro matriz[3][3], linha, coluna, somaTotal = 0, somaDiagonal = 0

		//Processamento de Dados:
			//Processamento de Dados 1:
				para(linha=0; linha < 3; linha++){

			//Processamento de Dados 2:
				para(coluna=0; coluna < 3; coluna++){

		//Entrada de Dados:
			//Entrada de Dados 1:
				//Entrada de Dados com o Usuário, com Texto em Bloco:
				escreva("Digite um número para a linha nº ",linha+1,", coluna nº ",coluna+1,": ")

				//Para a Leitura dos Dados Inseridos pelo Usuário:
				leia(matriz[linha][coluna])
					 
				}
			
				}

				//Para limpar os Dados Inseridos pelo Usuário:
				limpa()

			//Processamento de Dados 3:
				para(linha=0; linha < 3; linha++){

			//Processamento de Dados 4:
				para(coluna=0; coluna < 3; coluna++){
				somaTotal = somaTotal + (matriz[linha][coluna])

			//Processamento de Dados 5:
				se(linha == coluna){
				somaDiagonal = somaDiagonal + matriz[linha][coluna]
				}

		//Saída de Dados:
			//Saída de Dados 1:
				//Saída de Dados com o Usuário, com Texto em Bloco:
				escreva(matriz[linha][coluna]," ")
				}
				
			//Saída de Dados 2:
				escreva("\n")
				}
				
			//Saída de Dados 3:
				escreva("\nA somatória da diagonal é: ",somaDiagonal)
				
			//Saída de Dados 4:
				escreva("\nA somatória de todos os valores é: ",somaTotal)			

		}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1023; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */