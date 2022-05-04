programa
{
	
	funcao inicio()
	{
		real matriz[3][3], soma, diagonal
		inteiro x , y
		soma = 0.0
          diagonal = 0.0
		para(x = 0; x < 3; x++)
		{
			para(y = 0; y < 3; y++)
			{
				leia(matriz[x][y])
				soma += matriz[x][y]
				se (x == y)
				{
					diagonal += matriz[x][y]
				}
			}
		}
		escreva("\n soma dos elementos : ", soma)
		escreva("\n soma da diagonal : ", diagonal)
          
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 393; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 7, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */