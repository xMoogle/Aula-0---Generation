package ProjectJava;

import java.util.List;

public abstract class Questao
{
 public abstract String getEnunciado();
 public abstract List<String> getAlternativas();
 public abstract String getAlternativaCorreta();
 public abstract String getFeedbackE();
 public abstract String getFeedbackC();
 
  public void execute() 
  {
	 System.out.println(getEnunciado());
	 for (String alternativa : getAlternativas()) 
	 {
		 System.out.println(alternativa);
	 }
	 String resposta;
	 do 
	 {
		 System.out.println("");
		 resposta = Scanner.ler();
		 System.out.println("");
		 if(alternativaInvalida(resposta))
		 {
			 System.out.println("Alternativa inválida! Tente novamente");
		 }
		 else 
		 {
			 String feedback = getFeedback(resposta);
			 System.out.println(feedback);
		 }
	
     }
	 while(resposta.equals(getAlternativaCorreta()) == false);
	 System.out.println("\nPressione qualquer tecla para continuar...\n");
	 Scanner.pressToContinue();
	 
    	 
	 
	 
  }

private String getFeedback(String resposta) 
{
	if(alternativaCorreta(resposta)) 
	{
		return getFeedbackC();
	}
	else return getFeedbackE();
    }

private boolean alternativaCorreta(String resposta) 
{
	return resposta.equals(getAlternativaCorreta());	
}
private boolean alternativaInvalida(String resposta)
{
   if(resposta.equals("a") || resposta.equals("b") || resposta.equals("c")|| resposta.equals("d") || resposta.equals("e"))
   {
	   return false;
   }
   else 
   {
	   return true;
   }
   
}
public void encerramento()
{
	System.out.println("Parabens! Quiz encerrado!");
}


}