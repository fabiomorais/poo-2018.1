package patterns.factory_method;

public class PizzaMoussarelaJP extends Pizza {

	String sabor = "Moussarela JP";
	
	public String toString() {
		return getSabor();
	}

	@Override
	String getSabor() {
		return sabor;
	}
	
}
