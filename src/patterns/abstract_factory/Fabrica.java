package patterns.abstract_factory;

public abstract class Fabrica {

	public Sanduiche montarSanduche() {
		// TODO Auto-generated method stub
		Pao f1 = criarPao();
		Pao f2 = criarPao();
		Queijo q = criarQueijo();
		Presunto p = criarPresunto();
		
		return new Sanduiche(f1, f2, q, p);
	}
	protected abstract Presunto criarPresunto();
	protected abstract Queijo criarQueijo();
	protected abstract Pao criarPao();

}
