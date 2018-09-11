package patterns.factory_method;

public class TestaPizzaria {

	public static void main(String[] args) {
		
		Pizzaria p1 = new PizzariaRT();
		
		Pizza p = p1.pedidoPizza("calabresa");
		
		System.out.println(p.toString());
	
		p = p1.pedidoPizza("pepperoni");
		
		System.out.println(p.toString());
		
		Pizzaria p2 = new PizzariaJP();
		p = p2.pedidoPizza("moussarela");
		System.out.println(p.toString());
	}

}
