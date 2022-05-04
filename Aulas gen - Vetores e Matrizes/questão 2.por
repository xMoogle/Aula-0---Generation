programa
{
	
	funcao inicio()
	{
		real vetor[10], x, soma, contador, maior
		soma = 0.0
		contador = 0.0
		maior = 0.0
		para (x=0; x <10; x++)
		{
			leia(vetor[x])
			soma += vetor[x]
			se (vetor[x] > maior)
			{
				maior = vetor[x]
				contador = 1
			}
			senao se(vetor[x] == maior)
			{
				contador++
			}
		}
		para (x=0; x<10; x++)
		{
			escreva("\n",vetor[x])
		}
		escreva("\nA média dos lançamentos é : ", soma/10)
		escreva("\nO numero maior é : ", maior)
		escreva("\n O numero de ocorrencias do numero ", maior," é : ", contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 124; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */