package exlonge;

public class Main {

	public static void main(String[] args) {

		Ram objRam01 = new Ram("DDR3", 4);
		Processador objProc01 = new Processador("Apple A2", "A13 fusion", 2.5);
		Tela objTela01 = new Tela(5.0, "750 x 1334");
		Bateria objBateria01 = new Bateria(4000);
		Camera objCam01 = new Camera("4608 x 2592");

		Smartphone objSP01 = new Smartphone("Iphone 11", objRam01, objProc01, objTela01, objBateria01, objCam01);

		Ram objRam02 = new Ram("DDR3", 2);
		Processador objProc02 = new Processador("Samsung", "Exynos 9820", 2.7);
		Tela objTela02 = new Tela(5.8, "1440 x 2960");
		Bateria objBateria02 = new Bateria(3000);
		Camera objCam02 = new Camera("4290 x 2800");

		Smartphone objSP02 = new Smartphone("Samsung s20", objRam02, objProc02, objTela02, objBateria02, objCam02);

		objSP01.imprimirDados();

		objSP02.imprimirDados();
	}

}
