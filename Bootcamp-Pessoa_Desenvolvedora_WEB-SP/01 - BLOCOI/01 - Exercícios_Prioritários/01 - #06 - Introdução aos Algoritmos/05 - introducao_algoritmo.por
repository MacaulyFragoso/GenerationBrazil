//Package: Organizar Classes Relacionadas.
programa{

	/*Programa: NotatoN
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdução aos Algoritmos.
 	 * Exercício 5: Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada
 	   e que o peso das notas é: 2,3 e 5, respectivamente.*/
	
		//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos.
		funcao inicio(){
		
			//Variável = Tipo de Dado + Declaração, respectivamente.
				inteiro peso1 = 2, peso2 = 3, peso3 = 5
				inteiro valor1, valor2, valor3, media, soma1, soma2, soma3, mediaFinal

			//Entrada de Dados:
				//Entrada de Dados com o Usuário, com Texto em Bloco.
				escreva("Em números, digite o valor para a primeira nota: ")
				leia(valor1)

				escreva("Em números, digite o valor para a segunda nota: ")
				leia(valor2)

				escreva("Em números, digite o valor para a terceira nota: ")
				leia(valor3)

			//Processamento de Dados:
				media = (valor1 + valor2 + valor3) / 3
				soma1 = media + peso1
				soma2 = media + peso2
				soma3 = media + peso3
				mediaFinal = (soma1 + soma2 + soma3) / 3

			//Saída de Dados:
				escreva( "1 matéria, nota: " + soma1 + "\n2 matéria, nota: " + soma2 + "\n3 matéria, nota: " + soma3 + "\nA média Final é: " + mediaFinal)
				
			}
			
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 520; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
