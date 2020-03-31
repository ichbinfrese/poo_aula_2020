
public class Smartphone {

	private String modeloCelular;

	public String getModeloCelular() {
		return modeloCelular;
	}
	
	public Smartphone(String modeloCelular) {
		this.modeloCelular = modeloCelular;
	}

	public void imprimirDados() {
		System.out.println("------------------------------------------");
		System.out.println("Modelo do celular: " + getModeloCelular());
	}
	
}
