package patterns.observer;
import java.util.ArrayList;
import java.util.List;

public class Editora {
	
	List<EditoraListener> listeners = new ArrayList<EditoraListener>();
	
	public void publicaNoticia(String titulo) {
		this.disparaPubNoticia(titulo);
	}
	
	public void publicaReportagem(String titulo) {
		this.disparaPubReportagem(titulo);
	}
	
	private void disparaPubNoticia(String titulo) {
		EventoPublicacao ev = new EventoPublicacao(titulo);
		for (EditoraListener e : listeners) {
			e.noticiaPublicada(ev);
		}
	}
	
	private void disparaPubReportagem(String titulo) {
		EventoPublicacao ev = new EventoPublicacao(titulo);
		for (EditoraListener e : listeners) {
			e.reportagemPublicada(ev);
		}
	}

	public synchronized void addListener(EditoraListener e) {
		if (!this.listeners.contains(e)) {
			this.listeners.add(e);
		}
		
	}

}
