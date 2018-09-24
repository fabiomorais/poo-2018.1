package patterns.singleton.exemplo1;

public class SingletonA implements ClasseSingleton {

	private String propriedade = null;
	private static ClasseSingleton instancia = null;
	
	private SingletonA() {
		this.propriedade = "ClasseA";
	}

	public static ClasseSingleton getInstance() {
		if(instancia == null) {
			instancia = new SingletonA();
		}
		return instancia;
	}

	@Override
	public String getPropriedade() {
		return this.propriedade;
	}

}
