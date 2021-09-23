//Package: Organizar Classes Relacionadas:
programa{

	/*Programa: CronômetroX.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdução aos Algoritmos.
 	 * Exercício 3: Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
	
	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
	funcao inicio(){
	
		//Variável = Tipo de Dado + Declaração, respectivamente:
			inteiro segundo, hora, minuto, segundos

		//Entrada de Dados:
			//Entrada de Dados com o Usuário, com Texto em Bloco:
			escreva("Em números, digite quantos segundos durou o evento: ")
			//Para a leitura de dados:
			leia(segundo)

		//Processamento de Dados:
			hora = segundo / 3600
			minuto = (segundo % 3600)/60
			segundos = (segundo % 3600)%60

		//Saída de Dados:
			escreva( "O evento durou: " + hora + " horas " + minuto + " minutos " + segundos + " segundos ")
			
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 46; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
