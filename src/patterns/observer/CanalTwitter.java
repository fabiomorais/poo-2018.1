package patterns.observer;

public class CanalTwitter extends ListenerAdapter{

	@Override
	public void noticiaPublicada(EventoPublicacao evento) {
		System.out.println("Twitter recebe noticia:" + evento.getTitulo());
	}

}
