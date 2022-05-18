package orientacaoObjeto;

public class Cliente 
{
  public String nome;
  public int idade;
  public int cpf;
  public int rg;

  public Cliente(String nome, int idade, int cpf, int rg)
  {
	  this.cpf = cpf;
	  this.nome = nome;
	  this.rg = rg;
	  this.idade = idade;
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

public int getCpf() {
	return cpf;
}

public void setCpf(int cpf) {
	this.cpf = cpf;
}

public int getRg() {
	return rg;
}

public void setRg(int rg) {
	this.rg = rg;
}

}
