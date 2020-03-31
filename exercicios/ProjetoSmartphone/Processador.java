
public class Processador  {

	private String marca, modelo;
	private double velocidade;
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public double getVelocidade() {
		return velocidade;
	}
	
	
	public Processador(String marca, String modelo, double velocidade) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidade = velocidade;
	}
	
	public void imprimirDados() {
		System.out.println("Marca do Processador: " + getMarca());
		System.out.println("Modelo do Processador: " + getModelo());
		System.out.println("Velocidade do Processador: " + getVelocidade() + "GHz");
	}
	
	
	
}
