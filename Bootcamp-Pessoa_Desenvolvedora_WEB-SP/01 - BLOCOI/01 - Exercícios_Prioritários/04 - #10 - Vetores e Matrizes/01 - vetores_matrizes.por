//Package: Organizar Classes Relacionadas.
programa{

	/*Programa:
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #10 - Vetores e Matrizes.
 	 * Exercício 1: Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. Encontre
 	   após a maior pontuação e a apresente.*/

	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos.
	funcao inicio(){
		
		//Variável = Tipo de Dado + Declaração + Valor, respectivamente.
		real pontuacao[5], maiorPontuacao = 0.00
		inteiro valores = 5

			//Laço de Reptição PARA: Aqui está sendo usado para fazer a quantidade de Loopings possíveis, menor que o valor de "Valores".
			//++ Está sendo usado aqui para exibir "x" mais 1 vez, á cada giro.
			para (inteiro x=0; x < valores; x++){
			escreva("Entre com a pontuação: ")
			leia(pontuacao[x])
			
				se (pontuacao[x] > maiorPontuacao){
					maiorPontuacao = pontuacao[x]
					}
			}
			
			para (inteiro x=0; x < valores; x++){
			escreva("Valor da pontuação ",x+1,": ",pontuacao[x],"\n")
			}
			
			escreva("\nA maior pontuação é ",maiorPontuacao)
			
				}
				
	   }
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1218; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */