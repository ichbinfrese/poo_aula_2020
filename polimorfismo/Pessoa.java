package polimorfismo;

public class Pessoa {

	private int rg;
	private String nome;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome, int rg) {
		this.nome = nome;
		this.rg = rg;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}
	public String getNome() {
		return this.nome;
	}
	public int getRG() {
		return this.rg;
	}
}
