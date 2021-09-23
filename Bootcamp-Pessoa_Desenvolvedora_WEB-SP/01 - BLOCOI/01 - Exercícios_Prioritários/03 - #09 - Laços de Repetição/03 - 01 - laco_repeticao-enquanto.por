//Package: Organizar Classes Relacionadas:
programa{

	/*Programa: ProcesX.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #09 - Laços de Repetição | ENQUANTO (WHILE).
 	 * Exercício 1: Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, a média e o total
 	   de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve
 	   parar quando o usuário fornecer um valor negativo.*/

	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
	funcao inicio(){

		//Variável = Tipo de Dado + Declaração + Valor, respectivamente:
			inteiro numero, soma = 0, numerosLidos = 0
			real media = 0.0

		//Entrada de Dados:
			//Entrada de Dados com o Usuário, com Texto em Bloco:
			escreva("Para iniciarmos, digite um número positivo: ")
			//Para a Leitura dos Dados Inseridos pelo Usuário:
			leia(numero)

		//Processamento de Dados:
			enquanto(numero >= 0){
			soma = soma + numero
			media = soma / numero
			numerosLidos++	

		//Saída de Dados:
			//Saída de Dados 1:
				//Saída de Dados com o Usuário, com Texto em Bloco:
				escreva("Total do Somatório: ", soma , "\nMédia dos Valores: ", media, "\nTotal de Valores Lidos: ", numerosLidos)
				escreva("\n\nDigite um novo valor para a soma: ")
				leia(numero)	
				}
				
			//Saída de Dados 2:
				escreva("Número inválido, pois é um número negativo.", "\n")
				
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1565; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */