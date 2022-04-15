// Função do Algoritmo: Calcular a média aritmética
// Autor: Felipe Cabral

programa
{
	
	funcao inicio()
	{
		real nota1,nota2,nota3,nota4,media
		cadeia aluno

		escreva("Digite o nome do aluno:")
		leia(aluno)
		escreva("Digite nota1:")
		leia(nota1)
		escreva("Digite nota2:")
		leia(nota2)
		escreva("Digite nota3:")
		leia(nota3)
		escreva("Digite nota4:")
		leia(nota4)

		media = (nota1+nota2+nota3+nota4)/4

		escreva("O aluno: " + aluno + " obteve a média: " + media)
		// Verifica se a média é maior ou igual a 7
		se(media >= 7){
			escreva("Parabéns você foi Aprovado!") // Se verdadeiro, exibe mensagem de parabéns.
		}senao{
			escreva("\nVocê foi Reprovado!") // Caso não, exibe mensagem de reprovação
		}		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 722; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */