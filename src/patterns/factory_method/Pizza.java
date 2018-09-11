package patterns.factory_method;

public abstract class Pizza {
	
	public void assar() {
		System.out.println("Pizza no forno");
	}
	
	public void cortar() {
		System.out.println("Pizza cortada");
	}
	
	public void empacotar() {
		System.out.println("Pizza empacotada");
	}
	
	abstract String getSabor();
}
