package patterns.abstract_factory;

public class LanchoneteRT extends Lanchonete{

	@Override
	public Fabrica criarFabrica() {
		return new FabricaSRT();
	}
}
