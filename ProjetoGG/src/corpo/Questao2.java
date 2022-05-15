package corpo;
import java.util.ArrayList;
import java.util.List;

public class Questao2 
{
 public String enunciado;
 public List<String> alternativas;
 public String feedbackE;
 public String feedbackC;
 
 public Questao2()
 {
	this.enunciado = "Cadu é viado?";
	this.alternativas = new ArrayList<String>();
	alternativas.add("a) Sim");
	alternativas.add("b) Claro!");
	alternativas.add("c) Com certeza!");
 }
 
  public void execute() 
  {
	 System.out.println(enunciado);
	 for (String alternativa : alternativas) 
	 {
		System.out.println(alternativa);
	 }
	 String resposta;
	 resposta = Scanner.ler();
	 String feedback = getFeedback(resposta);
	 System.out.println(feedback);
	 
	
  }

private String getFeedback(String resposta) 
{
	if(taCerto(resposta)) 
	{
		return "Tá certo";
	}
	else return "Errado não tá";
    }

private boolean taCerto(String resposta) 
  {
	return resposta.equals("b");	
  }


}