package polimorfismo.pecas;

public class Smartphone {

	private String nome;

	private Ram objRam;
	private Processador objProcessador;
	private Tela tela;
	private Bateria objBateria;
	private Camera objCamera;

	public Smartphone() {

	}

	public Smartphone(String nome, Ram objRam, Processador objProcessador, Tela tela, Bateria objBateria,
					  Camera objCamera) {

		this.nome = nome;
		this.objRam = objRam;
		this.objProcessador = objProcessador;
		this.tela = tela;
		this.objBateria = objBateria;
		this.objCamera = objCamera;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Ram getObjRam() {
		return objRam;
	}

	public void setObjRam(Ram objRam) {
		this.objRam = objRam;
	}

	public Processador getObjProcessador() {
		return objProcessador;
	}

	public void setObjProcessador(Processador objProcessador) {
		this.objProcessador = objProcessador;
	}

	public Tela getTela() {
		return tela;
	}

	public void setTela(Tela tela) {
		this.tela = tela;
	}

	public Bateria getObjBateria() {
		return objBateria;
	}

	public void setObjBateria(Bateria objBateria) {
		this.objBateria = objBateria;
	}

	public Camera getObjCamera() {
		return objCamera;
	}

	public void setObjCamera(Camera objCamera) {
		this.objCamera = objCamera;
	}

	public void imprimirDados() {
		System.out.println("Nome do Smartphone: " + this.getNome());
		System.out.println(
				"Memoria: " + this.objRam.getTipo() + " com capacidade de " + this.objRam.getCapacidade() + "gb");
		System.out.println(
				"Pocessador: " + this.objProcessador.getModelo() + " da marca " + this.objProcessador.getMarca()
						+ " com uma velocidade de " + this.objProcessador.getVelocidade() + "GHz");
		System.out.println("Tamanho Tela: " + this.tela.getTamanho() + " Resolução:" + this.tela.getResolucao());
		System.out.println("Capacidade bateria: " + this.objBateria.getCapacidade() + "mAh");
		System.out.println("Resolução da Camera: " + this.objCamera.getResolucao() + "Px\n");
	}

}
