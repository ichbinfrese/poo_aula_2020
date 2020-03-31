
public class Tela {
	
	private double tamanho;
	private String resolucao;

	public double getTamanho() {
		return tamanho;
	}

	public String getResolucao() {
		return resolucao;
	}

	public Tela(double tamanho, String resolucao) {
		this.tamanho = tamanho;
		this.resolucao = resolucao;
	}

	public void imprimirDados() {
		System.out.println("Tamanho da tela: " + getTamanho() + " polegadas");
		System.out.println("Resolução da tela: " + getResolucao() + " pixels");
	}
	
}
