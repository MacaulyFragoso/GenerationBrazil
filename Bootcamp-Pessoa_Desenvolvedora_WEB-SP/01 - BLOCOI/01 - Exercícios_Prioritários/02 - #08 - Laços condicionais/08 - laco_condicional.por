//Package: Organizar Classes Relacionadas:
programa{

	/*Programa:
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * Exercício 8: Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100, caso contrário
 	   imprimi-la com o valor zero.*/

	funcao inicio(){
		
		//Variável = Tipo de Dado + Declaração, respectivamente:
   			inteiro numero, num = 0

   		//Entrada de Dados:
			//Entrada de Dados com o Usuário, com Texto em Bloco:		 
   			escreva("Para iniciarmos, digite um numero: ")
   			leia(numero)

  		//Processamento de Dados:
			//Processamento de Dados 1:
			se(numero > 100){
				
		//Saída de Dados:
			//Saída de Dados 1:
			escreva("Impressão: " + numero)				
			}
			
			//Processamento de Dados 2:
			senao se(numero < 100){
							
			//Saída de Dados 2
			escreva("Impressão: " + num)				
			}
   					
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 929; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */