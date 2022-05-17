package tarefas;

public class Enunciado 
{
 public String textoEnunciado;
 public  Enunciado[] E = new Enunciado[5];

  
 public Enunciado(String textoEnunciado)
 {
	 	this.textoEnunciado = textoEnunciado; 
 }

public String getTextoEnunciado() {
	return textoEnunciado;
}

public void setTextoEnunciado(String textoEnunciado) {
	this.textoEnunciado = textoEnunciado;
}

public void preencher() 
{
	E[0].setTextoEnunciado("vai ter perguntinha aqui 1");
	E[1].setTextoEnunciado("vai ter perguntinha aqui 2");
	E[2].setTextoEnunciado("vai ter perguntinha aqui 3");
	E[3].setTextoEnunciado("vai ter perguntinha aqui 4");
	E[4].setTextoEnunciado("vai ter perguntinha aqui 5");
}

}

