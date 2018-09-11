package patterns.observer;

public class TesteObserver {

	public static void main(String[] args) {
		

		
		Editora editora = new Editora();
		
		Portal portal = new Portal();
		CanalTwitter ct = new CanalTwitter();
		
		editora.addListener(portal);
		editora.addListener(ct);
		
		editora.publicaNoticia("Primeira noticia");
		editora.publicaReportagem("Primeira reportagem");
		editora.publicaNoticia("Segunda noticia");
		
	}

}
