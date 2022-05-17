package tarefas;
import java.util.Scanner;
public class tarefadia0905202204 
{
	public static void main(String[] args) 
	{
		int n=0, soma=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira as idades dos voluntarios");
		do
		{
			n = scan.nextInt();
			soma += n;
		}while(n != 0);
		System.out.println("A soma dos numeros digitados: "+soma);
	}
}
