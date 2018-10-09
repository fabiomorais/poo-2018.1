package patterns.abstract_factory;

public class LanchoneteCG extends Lanchonete {

	@Override
	public Fabrica criarFabrica() {
		return new FabricaSCG();
	}
}
