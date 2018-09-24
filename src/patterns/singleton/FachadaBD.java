package patterns.singleton;

import java.io.BufferedInputStream;
import java.net.URL;
import java.util.Properties;

public class FachadaBD {

	protected static FachadaBD instance = null;

	protected String driver = "oracle.jdbc.driver.OracleDriver";
	protected String urlPrefix = "jdbc:oracle:thin:@//";
	private String address = "10.0.0.1:1521";
	private String schema = "database1";
	private String user = "root";
	private String password = "123";

	protected FachadaBD() {
		// TODO Auto-generated constructor stub
	}

	public static FachadaBD getInstance() {
		if(instance == null) {
			instance = new FachadaBD();
		}
		return instance;
	}

	public void carregarDados(String arquivo) {

		Properties prop = new Properties();

		try {

			URL resource = FachadaBD.class.getResource(arquivo);

			if(resource == null) {

				throw new RuntimeException("Nao pode achar recurso: " + arquivo);

			}

			prop.load(new BufferedInputStream(resource.openStream()));

		} catch(Exception ex ) {

			System.err.println(ex.getMessage());

		}

		driver = prop.getProperty("driver", driver);
		urlPrefix = prop.getProperty("url.prefix", urlPrefix);
		address = prop.getProperty("address", address);
		schema = prop.getProperty("schema", schema);
		user = prop.getProperty("user", user);
		password = prop.getProperty("password", password);
	}


	public String getDriver() {
		return driver;
	}

	public String getURL() {
		return urlPrefix + address + schema;
	}


	public String getUser() {
		return user;
	}

	
	public String getPassword() {
		return password;
	}


	public String abrirConexao() {

		//Class.forName(getDriver());
		//return DriverManager.getConnection(getURL(), getUser(), getPassword());
		return getURL() + getUser() + getPassword();
	}
}
