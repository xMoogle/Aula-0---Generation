programa
{
	
	funcao inicio()
	{
		real vetor[5], maior
		inteiro x
		maior = 0.0
		para (x=0; x<5; x++)
		{
			leia(vetor[x])
			se (vetor[x] > maior)
			{
				maior = vetor[x]
			}
		}
		para (x=0;x<5; x++)
		{
			escreva("\n",vetor[x])
		}
		escreva("\nO maior numero é : ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 242; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */