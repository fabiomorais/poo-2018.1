package patterns.abstract_factory;

public abstract class Lanchonete {

	public void montarSanduiche() {
		Fabrica fabrica = criarFabrica();
		Sanduiche sanduiche = fabrica.montarSanduche();
		System.out.println(sanduiche);
	}
	
	public abstract Fabrica criarFabrica();
}
