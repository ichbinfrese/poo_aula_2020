package polimorfismo.ex;

import polimorfismo.pecas.Smartphone;

public class Aluno extends SerHumano {
	private String nome;
	private Smartphone smartphone;

	Aluno() {
		super(); // Construtor Pai this.nome="Sem nome";

		smartphone = new Smartphone();
	}

	@Override
	public void locomover_rapido() {
		System.out.println("Automovel");
	}

	public void getNome() {
		System.out.println(nome);
	}

	public void setNome(String n) {
		this.nome = n;
	}
}