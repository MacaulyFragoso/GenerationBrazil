//Package: Organizar Classes Relacionadas:
programa{

	/*Programa: ConverSário
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdução aos Algoritmos.
 	 * Exercício 2: Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.*/
	  
	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
	funcao inicio(){
	
		//Variável = Tipo de Dado + Declaração, respectivamente:
			inteiro idadeDias, anos, meses, dias

		//Entrada de Dados:
			//Entrada de Dados com o Usuário, com Texto em Bloco:
				escreva("Em números, digite quantos dias de vida você tem: ")
				leia(idadeDias)

		//Processamento de Dados:
			anos = idadeDias / 365
			meses = (idadeDias % 365)%12
			dias = (idadeDias % 365)%30

		//Saída de Dados:
			escreva( "Você tem: " + anos + " anos " + meses + " meses " + dias + " dias ")
			
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 141; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
