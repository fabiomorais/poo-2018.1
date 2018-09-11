package patterns.factory_method;

public abstract class Pizzaria {

	public Pizza pedidoPizza(String sabor) {

		Pizza p = criarPizza(sabor);
		
		p.assar();
		p.cortar();
		p.empacotar();
		
		return p;
		
	}

	 protected abstract Pizza criarPizza(String sabor);	
}
