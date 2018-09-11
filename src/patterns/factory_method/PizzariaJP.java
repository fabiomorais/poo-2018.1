package patterns.factory_method;

public class PizzariaJP extends Pizzaria {

	protected Pizza criarPizza(String sabor) {
		Pizza p = null;
		
		if(sabor == "calabresa") {
			p = new PizzaCalabresaJP();
		}else if (sabor == "moussarela") {
			p = new PizzaMoussarelaJP();
		}else if (sabor == "pepperoni") {
			p = new PizzaPepperoniJP();
		}
		return p;
	}

}
