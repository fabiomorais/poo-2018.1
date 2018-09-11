package patterns.factory_method;

public class PizzariaRT extends Pizzaria {

	protected Pizza criarPizza(String sabor) {
		Pizza p = null;
		
		if(sabor == "calabresa") {
			p = new PizzaCalabresa();
		}else if (sabor == "moussarela") {
			p = new PizzaMoussarela();
		}else if (sabor == "pepperoni") {
			p = new PizzaPepperoni();
		}
		return p;
	}
	
	
	

}
