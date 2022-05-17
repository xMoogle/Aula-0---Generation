package tarefas;
import java.util.Scanner;
public class tarefa100520222 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int A[][] = new int[3][3];
		int linha = 0, coluna = 0, n = 0;
		System.out.println("\nInsira os valores da Matriz: ");
		for(linha = 0; linha < 3; linha++)
		{   
			System.out.printf("\n");
			for(coluna = 0; coluna < 3; coluna++)
			{
				System.out.printf("\t");
				A[linha][coluna] = scan.nextInt();
				if(A[linha][coluna]>10)
				{
					n++;
				}
			}
		}
		System.out.printf("\nQuantidade de números maiores que 10: \n%d\n", n);
		System.out.printf("\nNumeros maiores que 10 digitados: ");
		for(linha = 0; linha < 3; linha++)
		{   
			for(coluna = 0; coluna < 3; coluna++)
			{
			if(A[linha][coluna] > 10) 
			{
			System.out.printf("\t%d", A[linha][coluna]);
			}
		    }
		}
	  }
}
