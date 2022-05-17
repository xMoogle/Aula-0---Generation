package tarefas;
import java.util.Scanner;
public class auladia 
{

	public static void main(String[] args) 
	{
	 Scanner scan = new Scanner(System.in);
	 int i = 0, count21 = -1, count50 = 0;	
     while(i != -99)
     {
    	 i = scan.nextInt();
    	 if(i <= 21)
    	 {
    		 count21++;
    	 }
    	 else if(i >= 50)
    	 {
    		 count50++;
    	 }
     }
      System.out.printf("\nPessoas com menos de 21 anos: %d\nPessoas com mais de 50 anos %d", count21, count50);
	}

}
