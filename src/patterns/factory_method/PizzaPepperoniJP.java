package patterns.factory_method;

public class PizzaPepperoniJP extends Pizza {

	String sabor = "Pepperoni JP";
	
	public String toString() {
		return getSabor();
	}

	@Override
	String getSabor() {
		return sabor;
	}
	
}
