//Package: Organizar Classes Relacionadas.
programa{

	/*Programa: LinerX.
	 * Autor: Macauly Fragoso.
 	 * Para: Bootcamp - Pessoa Desenvolvedora WEB SP | Generation Brazil.
 	 * BLOCO I.
 	 * #06 - Introdução aos Algoritmos.
 	 * Exercício 7: Um sistema de equações lineares do tipo: ax + by = c e dx + ey = f, pode ser resolvido segundo mostrado abaixo:
 	   x = ce-bf/ae-bd e y = af-cd/ae-bd. Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.*/

	inclua biblioteca Matematica -->mat

		//Classe: Especificação de Atributos; Comportamento de Objetos, através de Métodos:
		funcao inicio(){

			//Variável = Tipo de Dado + Declaração, respectivamente:
				real a,b,c,d,E,f,x,y

			//Entrada de Dados:
				//Entrada de Dados com o Usuário, com Texto em Bloco:
				escreva("Para começarmos, digite o valor A: ")
				//Saída de Dados com o Usuário, com Texto em Bloco:
				leia(a)

				escreva("Agora, digite o valor B: ")
				leia(b)

				escreva("Show! agora digite o valor C: ")
				leia(c)

				escreva("Estamos quase lá, digite agora o valor D: ")
				leia(d)

				escreva("Prometo que falta pouco, digite agora o valor E: ")
				leia(E)

				escreva("Só falta mais um! Digite agora o valor de F: ")
				leia(f)

			//Processamento de Dados:
				x=(c*E)-(b*f)/(a*E)-(b*d)
				y=(a*f)-(c*d)/(a*E)-(b*d)

			//Saída de Dados:
				//Saída de Dados com o Usuário, com Texto em Bloco:
				escreva("O valor de X é: ",mat.arredondar(x, 2),"  e "," O valor de Y é: ",mat.arredondar(y,2))
			
		}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1466; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
