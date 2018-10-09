package patterns.abstract_factory;

public class LanchoneteJP extends Lanchonete {

	@Override
	public Fabrica criarFabrica() {
		return new FabricaSJP();
	}
}
