//Package: Organizar Classes Relacionadas:
programa{

	/*Programa: ContNew.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #09 - Laços de Repetição | FACA...ENQUANTO (DO...WHILE).
 	 * Exercício 1: Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de 3 em 3 quando estiver entre 300 e 400 e
 	   de 5 em 5 quando não estiver.*/

	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
	funcao inicio(){

		//Variável = Tipo de Dado + Declaração + Valor, respectivamente:
			inteiro numero = 233

		//Processamento de Dados:
			//Processamento de Dados 1:
				faca{
		//Saída de Dados:
			//Saída de Dados com o Usuário, com Texto em Bloco:
			escreva(numero,"\n")

			//Processamento de Dados 2:
				se (numero >= 300 e numero <= 400){
				numero = numero + 3
				}
				
					senao{
					numero = numero + 5
					}
				}
					enquanto (numero <= 456)
				
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 985; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */