package Tarefas;
import java.util.Scanner;
public class Tarefa1 
{

	public static void main(String[] args) 
	{
		int a, b, c, maior;
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira tr�s n�meros");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		if (a > b)
		{
			if( a > c)
			{
				maior = a;
			}
			else 
			 {
			  maior = c;
			 }
		}
		else
		{
			if(b > c)
			{
				maior = b;
			}
			else 
			 {
				maior = c;
			 }
		}
	System.out.println("O maior n�mero �: "+maior);
		
	}

}