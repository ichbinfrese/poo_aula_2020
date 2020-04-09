package polimorfismo;

public class Aviao extends Brinquedo{

	private String nome;
	private String tipo;

	public Aviao() {

	}

	public Aviao(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public void mover() {
		System.out.println("VOAR");
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