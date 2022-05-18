package polimorfia;

public class EmitirSom {

	public static void main(String[] args)
	{
		Cachorro cao = new Cachorro("Bob", 3, "anda");
		Cavalo peDePano = new Cavalo("Pé de pano", 3, "cavalga");
		Preguica Mat = new Preguica("Mat", 2, "Escala");
		Mat.emitirSom();
		peDePano.emitirSom();
		cao.emitirSom();
				
	}

}
