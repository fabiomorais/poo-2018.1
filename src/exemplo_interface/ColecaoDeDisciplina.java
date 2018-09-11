package exemplo_interface;

import java.util.ArrayList;
import java.util.List;

public class ColecaoDeDisciplina implements Selecionavel {

	List<Nomeavel> disciplinas = new ArrayList();

	@Override
	public List<Nomeavel> getList() {
		// TODO Auto-generated method stub
		return this.disciplinas;
	}

}
