//Package: Organizar Classes Relacionadas:
programa{

	/*Programa: CalculoExpress.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdução aos Algoritmos.
 	 * Exercício 4: Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:
 	   D=R+S/2, onde R=(A+B)*2 E S=(B+C)*2   */

 	inclua biblioteca Matematica --> mat

		//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
		funcao inicio(){
			
			//Variável = Tipo de Dado + Declaração, respectivamente:
				real numeroA, numeroB, numeroC, numeroR, numeroS, resultado

			//Entrada de Dados:
				//Entrada de Dados com o Usuário, com Texto em Bloco:
				escreva("Para prosseguirmos, digite 3 números inteiros, sendo eles positivos: \n")
				escreva("Número A: ")
				//Para a leitura de dados:
				leia(numeroA)
				
				escreva("Número B: ")
				leia(numeroB)
				
				escreva("Número C: ")
				leia(numeroC)

			//Processamento de Dados:
				//Processamento de Dados 1:
				numeroR = (mat.potencia (numeroA, 2)) + (2 * numeroA * numeroB) + (mat.potencia (numeroB, 2))
	     			numeroS = (mat.potencia (numeroB, 2)) + (2 * numeroC * numeroB) + (mat.potencia (numeroC, 2))

				//Processamento de Dados 2:
				resultado = (numeroR + numeroS) / 2

			//Saída de Dados:
				//Saída de Dados com o Usuário, com Texto em Bloco:
				escreva("O resultado da expressão é: " + resultado)
				
		}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 921; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
