
public class Bateria  {

	private double capacidade;

	public double getCapacidade() {
		return capacidade;
	}

		public Bateria(double capacidade) {
		this.capacidade = capacidade;
	}

	public void imprimirDados() {
		System.out.println("Capacidade da bateria: " + getCapacidade() + "mAh");
	}
	
}
