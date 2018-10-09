package patterns.abstract_factory;

public class FabricaSJP extends Fabrica {

	public Pao criarPao() {
		return new Bola();
	}
	
	public Queijo criarQueijo() {
		return new Mussarela();
	}
	
	public Presunto criarPresunto() {
		return new DeFrango();
	}
}
