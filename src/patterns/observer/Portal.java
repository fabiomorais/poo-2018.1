package patterns.observer;

public class Portal implements EditoraListener{

	@Override
	public void noticiaPublicada(EventoPublicacao evento) {
		System.out.println("Portal recebe noticia:" + evento.getTitulo());
	}

	@Override
	public void reportagemPublicada(EventoPublicacao evento) {
		System.out.println("Portal recebe reportagem:" + evento.getTitulo());
	}

}
