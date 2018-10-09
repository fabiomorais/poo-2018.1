package patterns.abstract_factory;

public class FabricaSRT extends Fabrica {

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
		return new Integral();
	}
	
	public Queijo criarQueijo() {
		return new Cheddar();
	}
	
	public Presunto criarPresunto() {
		return new DePeru();
	}

}
