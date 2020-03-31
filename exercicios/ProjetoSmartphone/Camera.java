
public class Camera {
	
	private double resolucao;

	public double getResolucao() {
		return resolucao;
	}

	public Camera(double resolucao) {
		this.resolucao = resolucao;
	}
	
	public void imprimirDados() {
		System.out.println("Resolução da câmera: " + getResolucao() + "MP");
	}

}
