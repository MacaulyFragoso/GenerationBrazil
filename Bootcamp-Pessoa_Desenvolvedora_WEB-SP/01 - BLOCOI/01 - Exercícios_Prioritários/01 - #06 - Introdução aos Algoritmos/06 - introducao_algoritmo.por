//Package: Organizar Classes Relacionadas.
programa{

	/*Programa: Distancializando.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdução aos Algoritmos.
 	 * Exercício 6: Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2)
 	   escreva a distância entre eles. A fórmula que efetua tal cálculo é: D = √ (x2 - x1)*2 + (y2 - y1)*2   */

 	inclua biblioteca Matematica

		//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos
		funcao inicio(){

			//Variável = Tipo de Dado + Declaração, respectivamente:
				real x1, y1, x2, y2, distanciaRaiz, distanciaPotencia
		
			//Entrada de Dados:
				//Entrada de Dados com o Usuário, com Texto em Bloco:
				escreva("Para começarmos, digite o  primeiro valor do plano 1: ")
				//Para a Leitura dos Dados Inseridos pelo Usuário:
				leia(x1)
				
				escreva("Agora, digite o segundo valor do plano 1: ")
				leia(y1)
				
				escreva("Digite o  primeiro valor do plano 2: ")
				leia(x2)
				
				escreva("E agora, digite o segundo valor do plano 2: ")
				leia(y2)	

			//Processamento de Dados:
				//Processamento de Dados 1:
					distanciaPotencia = (Matematica.potencia((x2 - x1),2)) + (Matematica.potencia((y2 - y1),2))
					
				//Processamento de Dados 2:	
					distanciaRaiz = Matematica.raiz(distanciaPotencia, 2)
				
			//Saída de Dados:
				//Saída de Dados com o Usuário, com Texto em Bloco:
				escreva("A distancia entre os pontos é: ", + distanciaRaiz)
				
		}
				
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1449; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
