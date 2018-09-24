package patterns.singleton;

public class TestSingleton {

	public static void main(String[] args) {

		FachadaBD.getInstance().carregarDados("bd_oracle.properties");
		System.out.println(FachadaBD.getInstance().abrirConexao());

		FachadaHSQL.getInstance().carregarDados("bd_hsql.properties");	    
		System.out.println(FachadaHSQL.getInstance().abrirConexao());
		System.out.println(FachadaBD.getInstance().abrirConexao());
		
		
		FachadaBD.getInstance().carregarDados("bd_oracle.properties");
		System.out.println(FachadaBD.getInstance().abrirConexao());

		//FachadaHSQL.getInstance().carregarDados("bd_hsql.properties");	    
		//System.out.println(FachadaHSQL.getInstance().abrirConexao());

		
	}
}
