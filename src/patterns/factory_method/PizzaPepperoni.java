package patterns.factory_method;

public class PizzaPepperoni extends Pizza {

	String sabor = "Pepperoni";
	
	public String toString() {
		return getSabor();
	}

	@Override
	String getSabor() {
		return sabor;
	}
	
}
