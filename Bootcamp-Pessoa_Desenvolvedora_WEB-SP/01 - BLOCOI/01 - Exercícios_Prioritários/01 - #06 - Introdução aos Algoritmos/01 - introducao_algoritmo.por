programa{

	/*Programa: Há quantos dias você está na Terra?
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdução aos Algoritmos.
 	 * Exercício 1: Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.*/

	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos.
	funcao inicio(){
	
		//Variável = Tipo de Dado + Declaração + Valor, respectivamente.
			//inteiro diasAno = 365, diasMes = 30, dia, mes, ano
			inteiro anos, meses, dias

		//Entrada de Dados:
			//Entrada de Dados 1:
				//Entrada de Dados com o Usuário, com Texto em Bloco.
				escreva("Você gostaria de saber há quantos dias você está na Terra?\nSe sim, responda!\nEm números, quantos anos você tem?\n ")
				//Para a leitura de dados.
				leia(anos)
			
			//Entrada de Dados 2:
				//Entrada de Dados com o Usuário, com Texto em Bloco.
				escreva("\nAgora... Em números, em que mês você nasceu?\n ")
				//Para a leitura de dados.
				leia(meses)
			
			//Entrada de Dados 3:
				//Entrada de Dados com o Usuário, com Texto em Bloco.
				escreva("\nEstamos quase lá... Em números, qual foi o dia em que você nasceu?\n ")
				//Para a leitura de dados.
				leia(dias)
			
		//Processamento de Dados:
			//Processamento Lógico onde o Dia em que o Usuário nasceu, será = ao destrinchamento de anos e meses que ele tem, sendo ano com valor 365 e mes com valor 30.
			dias = (anos*365) + (meses*30) + dias

		//Saída de Dados:
			//Saída de Dados com o Usuário, com Texto em Bloco. Com "dia", referenciando o resultado do processamento.
			escreva("\nVocê está na terra há: " + dias + " dias\n\nObrigado!")
			
				}
		}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1717; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */