package tarefas;

public class TestandoProjeto {
	
	
	public static void main(String[] args) 
	{
	 
	   
	   Enunciado[] E = new Enunciado[5];
	   
       for(int x = 0; x < 5; x++)
       {
    	 System.out.println(E[x].getTextoEnunciado());
    	 System.out.println(E[0].getTextoEnunciado());
       }
	}
	
	
}
