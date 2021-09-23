//Package: Organizar Classes Relacionadas.
programa{

	/*Programa: ConcessCalc
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdução aos Algoritmos.
 	 * Exercício 8: O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos
 	   impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que
 	   leia o custo de fábrica de um carro e escreva o custo ao consumidor.*/

 	inclua biblioteca Matematica -->mat

		//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
		funcao inicio(){

			//Variável = Tipo de Dado + Declaração, respectivamente:
				real custoConsumidor, custoFabrica, distribuidor, impostos 

			//Entrada de Dados:
				//Entrada de Dados com o Usuário, com Texto em Bloco:
				escreva("Para iniciarmos, digite o valor de fábrica do veículo: ")
				//Para a leitura de dados.
				leia(custoFabrica)

			//Processamento de Dados:
				//Processamento de Dados 1:
				distribuidor = custoFabrica * 0.28
				impostos = custoFabrica * 0.45
			
				//Processamento de Dados 2:
				custoConsumidor = custoFabrica + distribuidor + impostos
			
			//Saída de Dados:
				escreva("O custo ao consumidor do veículo é: ", mat.arredondar (custoConsumidor, 2))
				
			}
			
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1417; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
