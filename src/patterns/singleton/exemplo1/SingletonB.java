package patterns.singleton.exemplo1;

public class SingletonB implements ClasseSingleton {
	
	private String propriedade = null;
	private static ClasseSingleton instancia = null;
	
	private SingletonB() {
		this.propriedade = "ClasseB";
	}

	public static ClasseSingleton getInstance() {
		if(instancia == null) {
			instancia = new SingletonB();
		}
		return instancia;
	}

	@Override
	public String getPropriedade() {
		return this.propriedade;
	}
}
