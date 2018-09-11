package exemplo_interface;

import java.util.ArrayList;
import java.util.List;

public class ColecaoDeAluno implements Selecionavel{

	List<Nomeavel> alunos = new ArrayList();
	
	public List<Nomeavel> getList(){
		return this.alunos;
	}
	
	public void add() {
		this.alunos.add(new Aluno());
	}
}
