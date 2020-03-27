package classes_objetos;

import java.util.Date;

public class Pessoa {

	private String nome;
	private String sobreNome;
	private int idade;
	private Date nascimento;
	private double altura;
	private double peso;

	public Pessoa() {
	
	}
	
	public Pessoa(String nome, String sobreNome) {
		this.nome = nome;
		this.sobreNome = sobreNome;
	}

	public Pessoa(String nome, String sobreNome, int idade, Date nascimento, double altura, double peso) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
		this.nascimento = nascimento;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
