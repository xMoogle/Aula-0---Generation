package orientacaoObjeto;

public class Aviao 
{
 public String tipo;
 public String nome;
 public int numeroDoModelo;
 
 public Aviao(String tipo, String nome, int numeroDoModelo)
 {
	 this.tipo = tipo;
	 this.nome = nome;
	 this.numeroDoModelo = numeroDoModelo;
			 
 }

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getNumeroDoModelo() {
	return numeroDoModelo;
}

public void setNumeroDoModelo(int numeroDoModelo) {
	this.numeroDoModelo = numeroDoModelo;
}
 
}
