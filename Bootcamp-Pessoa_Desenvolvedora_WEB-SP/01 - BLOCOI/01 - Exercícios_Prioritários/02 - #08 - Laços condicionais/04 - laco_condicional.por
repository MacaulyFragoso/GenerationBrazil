//Package: Organizar Classes Relacionadas:
programa{

	/*Programa: 3..2..1.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * Exercício 4: Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.*/

	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
	funcao inicio(){

   		//Variável = Tipo de Dado + Declaração, respectivamente:
   			inteiro numero
			
		//Entrada de Dados:
			//Entrada de Dados com o Usuário, com Texto em Bloco:
   		   	escreva("\nPara iniciarmos, digite o 1° Número que vier a sua mente: ")
   		   	//Para a Leitura dos Dados Inseridos pelo Usuário:
      			leia(numero)
      		
		//Processamento de Dados:
     			se(numero % 2 == 0){
		//Entrada de Dados:
			//Entrada de Dados 1:
				//Entrada de Dados com o Usuário:
        			escreva("\nEste número ",numero," é par ")
        		}
	   			senao{
			//Entrada de Dados 2:
				//Entrada de Dados com o Usuário
	   			escreva("\nEste número ",numero," é impar ")
	   			}

	   		se(numero >=0){
			//Entrada de Dados 3:
				//Entrada de Dados com o Usuário
	   			escreva("\nAlém de ",numero," também ser um número positivo ")
	  		}
	   			senao{
			//Entrada de Dados 4:
				//Entrada de Dados com o Usuário
	   			escreva("\n Além de ",numero," também ser um número negativo ")
	   			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1114; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
