package polimorfismo.ex;

public class SerHumano {
	protected String corOlhos;
	protected double altura;
	protected double peso;

	SerHumano() {
		this.corOlhos = "Preto";
		this.altura = 1.80;
		this.peso = 70;
	}

	public void locomover_lento() {
		System.out.println("Andar a pé");
	}

	public void locomover_rapido() {
		System.out.println("Nao possui");
	}
}