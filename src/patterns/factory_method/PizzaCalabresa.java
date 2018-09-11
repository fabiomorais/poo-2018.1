package patterns.factory_method;

public class PizzaCalabresa extends Pizza {

	String sabor = "Calabresa";
	
	public String toString() {
		return getSabor();
	}

	@Override
	String getSabor() {
		return sabor;
	}
}
