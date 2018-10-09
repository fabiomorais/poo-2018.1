package patterns.abstract_factory;

public class Sanduiche {
	
	private Pao fatia1;
	private Pao fatia2;
	private Queijo queijo;
	private Presunto presunto;
	private Salada salada;
		
	public Sanduiche(Pao f1, Pao f2, Queijo q, Presunto p) {
		fatia1 = f1;
		fatia2 = f2;
		queijo = q;
		presunto = p;
		salada = null;
	}

	public void addSalada(Salada s) {
		this.salada = s;
	}

}
