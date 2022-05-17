package tarefas;
import java.util.Scanner;
public class tarefadia090520222
{
	
	
public static void main(String[] args) 
{
  int  countp = 0, counti = 0, num;
  Scanner scan = new Scanner(System.in);
  for(int i = 1; i<11; i++)
  {
		num = scan.nextInt();
		if(num%2 == 1)
		{
			counti++;
		}
		else
		{
			countp++;
		}
		
  }
  System.out.printf("\nnúmeros impares: %d\nnúmeros pares: %d", counti, countp);
}

}