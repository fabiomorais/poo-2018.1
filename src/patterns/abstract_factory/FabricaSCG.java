package patterns.abstract_factory;

public class FabricaSCG extends Fabrica {

	@Override
	public Sanduiche montarSanduche() {
		Sanduiche sanduiche = super.montarSanduche();
		Salada s = criarSalada();
		sanduiche.addSalada(s);
		
		return sanduiche;
	}
	
	public Salada criarSalada() {
		return new Salada();
	}

	public Pao criarPao() {
		return new Frances();
	}
	
	public Queijo criarQueijo() {
		return new Prato();
	}
	
	public Presunto criarPresunto() {
		return new DeFrango();
	}




}
