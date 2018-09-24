package patterns.singleton.exemplo1;

public class MainTest {

	public static void main(String[] args) {

		ClasseSingleton s = SingletonA.getInstance();
		System.out.println(s.getPropriedade());
		
		s = SingletonB.getInstance();
		System.out.println(s.getPropriedade());
		
	}

}
