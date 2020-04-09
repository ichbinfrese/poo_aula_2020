package polimorfismo;

public class Principal {

	public static void main(String[] args) {
		Carro objCarro = new Carro();
		Aviao objAviao = new Aviao();
		
		ControleRemoto objCR = new ControleRemoto(objAviao);
		objCR.mover();
	}
}
