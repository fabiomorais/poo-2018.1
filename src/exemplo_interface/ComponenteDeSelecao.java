package exemplo_interface;

import java.util.Iterator;

public class ComponenteDeSelecao {

	public static void main(String[] args) {
		
		ColecaoDeAluno ca = new ColecaoDeAluno();
		ColecaoDeDisciplina cd = new ColecaoDeDisciplina();
		ComponenteDeSelecao cds = new ComponenteDeSelecao();
		cds.getListBox(ca, "joao");
		cds.getListBox(cd, "joao");
	}

	private void getListBox(Selecionavel ca, String string) {
		
		for(Nomeavel a: ca.getList()) {
			System.out.println(a.getNome());
		}
	}

}
