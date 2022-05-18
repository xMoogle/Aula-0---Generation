package orientacaoObjeto;

public class ProdutoEletronico 
{
 public String nome;
 public double preco;
 public int ID;
 public int Qtd;
 
 public ProdutoEletronico(String nome, double preco,int ID, int Qtd)
 {
	 this.nome = nome;
	 this.ID = ID;
	 this.preco = preco;
	 this.Qtd = Qtd;
 }

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public int getID() {
	return ID;
}

public void setID(int iD) {
	ID = iD;
}

public int getQtd() {
	return Qtd;
}

public void setQtd(int qtd) {
	Qtd = qtd;
}
}
