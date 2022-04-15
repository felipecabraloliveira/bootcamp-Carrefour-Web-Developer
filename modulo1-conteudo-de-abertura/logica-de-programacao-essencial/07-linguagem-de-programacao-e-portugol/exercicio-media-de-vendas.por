programa
{
	
	funcao inicio()
	{
		real mes1,mes2,mes3,mes4,media
		cadeia vendedor

		escreva("Digite o nome do vendedor: ")
		leia(vendedor)
		escreva("Digite a venda de Janeiro: R$")
		leia(mes1)
		escreva("Digite a venda de Fevereiro: R$")
		leia(mes2)
		escreva("Digite a venda de Março: R$")
		leia(mes3)
		escreva("Digite a venda de Abril: R$")
		leia(mes4)

		media = (mes1+mes2+mes3+mes4)/4

		escreva("Vendedor:" + vendedor + " possui a média de venda de R$" + media)		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 491; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */