package patterns.factory_method;

public class PizzaMoussarela extends Pizza {

	String sabor = "Moussarela";
	
	public String toString() {
		return getSabor();
	}

	@Override
	String getSabor() {
		return sabor;
	}
	
}
