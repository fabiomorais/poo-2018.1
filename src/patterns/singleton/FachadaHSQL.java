package patterns.singleton;

import java.io.BufferedInputStream;
import java.net.URL;
import java.util.Properties;

public class FachadaHSQL extends FachadaBD {

	public static FachadaBD getInstance() {
		if(instance == null) {
			instance = new FachadaHSQL();
		}
		return instance;
	}

	private String directory = "poo";

	private FachadaHSQL() {
		setDriver("org.hsqldb.jdbc.JDBCDriver");
		setUrlPrefix("jdbc:hsqldb:");
		setDirectory("db1");
	}

	public void carregarDados(String arquivo) {

		super.carregarDados(arquivo);

		Properties prop = new Properties();

		try {

			URL resource = FachadaHSQL.class.getResource(arquivo);

			if(resource == null) {
				throw new RuntimeException("Nao pode achar recurso: " + arquivo);
			}
			prop.load(new BufferedInputStream(resource.openStream()));
		} catch(Exception ex ) {
			System.err.println(ex.getMessage());
		}

		setDriver(prop.getProperty("driver"));
		setUrlPrefix(prop.getProperty("url.prefix"));
		setDirectory(prop.getProperty("directory"));
	}

	private void setUrlPrefix(String url) {
		urlPrefix = url;
	}
	
	private void setDriver(String driver) {
		this.driver = driver;
	}
	
	private void setDirectory(String directory) {
		this.directory = directory;
	}

	public String getDirectory() {
		return directory;
	}

	@Override
	public String getURL() {
		return urlPrefix + directory;

	}

}
