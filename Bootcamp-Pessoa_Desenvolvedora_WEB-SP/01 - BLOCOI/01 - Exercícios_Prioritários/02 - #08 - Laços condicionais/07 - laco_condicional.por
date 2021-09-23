//Package: Organizar Classes Relacionadas:
programa{
	
	/*Programa: 
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * Exercício 7: Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). Em caso
 	 * afirmativo, calcular a área do triângulo.*/

 	//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
	funcao inicio(){
		
		//Variável = Tipo de Dado + Declaração, respectivamente:
			real baseT = 0.0, alturaT = 0.0, triangulo = 0.0

		//Entrada de Dados:
			//Entrada de Dados com o Usuário, com Texto em Bloco:
			escreva("Insira o valor da base do triângulo: ")
			//Para a leitura de dados:
			leia(baseT)

			escreva("Indique a altura do triângulo: ")
			leia(alturaT)

		//Processamento de Dados:
			se(baseT >= 0 e alturaT >= 0){
				triangulo = (baseT * alturaT)/2

		//Saída de Dados:
			escreva("A área do triângulo é: " + triangulo)
			}
				senao{
						
					//Saída de Dados
					escreva("Os valores inseridos são inválidos.")
				}
	}	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 5; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */