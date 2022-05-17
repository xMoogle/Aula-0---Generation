package tarefas;

public class Preguica extends Animal
{
 String movimentacao;
 public Preguica(String nome, int idade, String movimentacao) 
 {
	 super(nome, idade, "zZzZzZz!", "andar");
	 this.movimentacao = movimentacao;
 }
public String getMovimentacao() {
	return movimentacao;
}
public void setMovimentacao(String movimentacao) {
	this.movimentacao = movimentacao;
}
@Override
public void setSom(String som)
 {
	this.som = som;
 }
@Override
public String getSom()
{
	return som;
}
@Override
public void emitirSom()
    {
	 System.out.println(som);
	}
 
}