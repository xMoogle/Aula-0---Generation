programa
{
	
	funcao inicio()
	{
		real C, N, S, E
		leia(C, N)
		se (N > 50)
		{
			E = (N-50)*20
			S = 500 + E
		}
		senao
		{
			E = 0
			S = N*10
		}
		escreva("Salario total : ", S, "\nSalario excedente : ", E)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 220; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */