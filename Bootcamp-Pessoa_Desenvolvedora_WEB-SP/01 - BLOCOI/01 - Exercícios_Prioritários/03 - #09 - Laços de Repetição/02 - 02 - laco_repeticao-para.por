//Package: Organizar Classes Relacionadas:
programa{

	/*Programa: Os1*+.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #09 - Laços de Repetição | PARA (FOR).
 	 * Exercício 2: Desenvolver um sistema que efetue a soma de todos os números ímpares que são múltiplos de três e que se encontram no conjunto dos
 	   números de 1 até 500.*/

	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
	funcao inicio(){

		//Variável = Tipo de Dado + Declaração + Valor, respectivamente:
			inteiro numerosImpares = 0

		//Processamento de Dados:
			//Processamento de Dados 1:
				//Laço de Reptição PARA (FOR): Aqui está sendo usado para fazer a quantidade de Loopings possíveis, entre os números 1 e 500.
				//++ está sendo usado aqui para somar mais 2 Números á cada giro.
				para (inteiro numero=1; numero<=500; numero++){
				
			//Processamento de Dados 2:
				se ((numero % 2) == 1 e (numero % 3) == 0){
				numerosImpares = numerosImpares + numero
				}
				}
			
		//Saída de Dados:
			//Saída de Dados com o Usuário, com Texto em Bloco:
			escreva("O somatório de números entre 1 e 500, ímpares, e multipos de 3 é: " + numerosImpares)
			
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1244; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */