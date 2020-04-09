package polimorfismo;

public class Barco {

	private String nome;
	private String tipo;

	public Barco() {

	}

	public Barco(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public void mover() {
		System.out.println("Navegar");
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}