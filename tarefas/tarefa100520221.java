package tarefas;
import java.util.Scanner;
public class tarefa100520221 
{
 public static void main(String[] args) 
 {
	 Scanner scan = new Scanner(System.in);
	 int numPar = 0, numImpar = 0, z = 0;
	 int[] A = new int[6];
	 int[] Impares = new int[6];
	 int[] Pares = new int[6];
	 for(int y = 1; y < 6; y++)
	 {
		 Impares[y] = 0;
	 }
	 for(int y = 1; y < 6; y++)
	 {
		 Pares[y] = 0;
	 }
	 
	 
	 for(int x = 0; x < 6; x++)
	 {
		 System.out.printf("\nInsira o %do número: ", x+1);
		 A[x] = scan.nextInt();
		 if(A[x] == 0) 
		 {
			z ++; 
		 }
		 else {
		  if(A[x]%2 == 1)
		  {
			 numImpar ++;
			 Impares[x] = A[x];
			 
		  }
		 else 
		 {
			numPar += A[x];
			Pares[x] = A[x];
		 }
	    }
	 }
	 System.out.println("Numeros pares digitados :");
	 for(int x = 0; x < z; x++)
	   {
		System.out.printf("\t0") ;
	   }
	 for(int x = 0; x < 6; x++)
	 {	
	     if(Pares[x] != 0) 
	     {
		 System.out.printf("\t%d", Pares[x]);	
	     }
	 }
	 System.out.println("\nSoma dos numeros pares: "+numPar);
	 System.out.println("Números impares digitados: ");
	 for(int x = 0; x < 6; x++)
	 {
		 if(Impares[x] != 0) 
		 {
			System.out.printf("\t%d", Impares[x]);
		 }
	 }
	 System.out.println("\nTotal de números impares: "+numImpar);
}
}
