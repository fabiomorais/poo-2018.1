package patterns.factory_method;

public class PizzaCalabresaJP extends Pizza {

	String sabor = "Calabresa JP";
	
	public String toString() {
		return getSabor();
	}

	@Override
	String getSabor() {
		return sabor;
	}
}
