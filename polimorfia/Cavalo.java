package polimorfia;

public class Cavalo extends Animal
{
 public String movimentacao;
 
 public Cavalo(String nome, int idade, String movimentacao)
 {
	 super(nome, idade, "\n*Relinchar*", movimentacao);
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
public String teste()
{return "0";}
}
