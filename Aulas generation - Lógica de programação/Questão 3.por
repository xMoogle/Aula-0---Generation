programa
{
	
	funcao inicio()
	{    real soma, media
	     inteiro x, n
	     soma = 0.0
	     n = 0
	     x = 0
		enquanto(x >= 0)
		{    
			leia(x)
			
			se(x >= 0)
			{
			soma += x
			n ++
			}
		}
		escreva("\nSoma : ", soma)
		escreva("\nMédia : ", soma/n)
		escreva("\nTotal de valores : ", n)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 93; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */