package patterns.strategy;

public class Contexto {

	private Estrategia estrategia; 
	
	private void ordenar(int[] vetor) {
		estrategia.ordenar(vetor);
	}
	public static void main(String[] args) {

		Contexto contexto = new Contexto();
		contexto.SetBubbleSort();
		contexto.SetMergeSort();
		contexto.ordenar(null);
		
		
		// TODO Auto-generated method stub

	}
	private void SetMergeSort() {
		// TODO Auto-generated method stub
		estrategia = new MergeSort();
	}
	private void SetBubbleSort() {
		estrategia = new BubbleSort();
		
	}

}
