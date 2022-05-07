package Tarefas;
import java.util.Scanner;
public class Tarefa2 
{

	public static void main(String[] args) 
	{		
     Scanner scan = new Scanner(System.in);
     int a, b, c, maior, a2, a3;
     System.out.println("Insira 3 números");
     a = scan.nextInt();
     b = scan.nextInt();
     c = scan.nextInt();
     if (a > b)
		{
			if( a > c)
			{
				maior = a;
				if (b > c)
				{
					a2 = b;
					a3 = c;
				}
				else 
				{
					a2 = c;
					a3 = b;
				}
			}
			else 
			 {
			  maior = c;
			  a2 = a;
			  a3 = b;
			 }
		}
		else
		{
			if(b > c)
			{
				maior = b;
				if(a > c) 
				{
					a2 = a;
					a3 = c;
				}
				else
				{
					a2 = c;
					a3 = a;
				}
			}
			else 
			 {
				maior = c;
				a2 = b;
				a3 = a;
			 }
		}
             System.out.println("Os números, em oredem crescente, são: " +a3 +", " +a2+ " e " +maior);
	}

}