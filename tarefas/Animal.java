package tarefas;

public class Animal 
{
  public String nome;
  public int idade;
  public String som;
  public String movimentacao;
  
  public Animal(String nome, int idade,  String som, String movimentacao) 
   {
	 super();
	 this.nome = nome;
	 this.idade = idade;
	 this.som = som;
	 this.movimentacao = movimentacao;
	 
   }

public String getMovimentacao() {
	return movimentacao;
}

public void setMovimentacao(String movimentacao) {
	this.movimentacao = movimentacao;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public String getSom() {
	return som;
}

public void setSom(String som) {
	this.som = som;
}
public void imprimir()
 {
	System.out.println("\nnome: "+getNome()+"\nIdade: "+idade+"\nSom"+som);
 }
public void emitirSom()
{
}
  
}
