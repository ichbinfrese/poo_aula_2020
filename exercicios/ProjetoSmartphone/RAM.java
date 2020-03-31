
public class RAM {
	
	private String tipo;
	private double capacidade;
	
	public String getTipo() {
		return tipo;
	}
	
	public double getCapacidade() {
		return capacidade;
	}
	
	public RAM(String tipo, double capacidade) {
		this.tipo = tipo;
		this.capacidade = capacidade;
	}
	
	public void imprimirDados() {
		System.out.println("Tipo da memória RAM: " + getTipo());
		System.out.println("Capacidade da memória RAM: " + getCapacidade() + "Gb");
	}
	
	
}
