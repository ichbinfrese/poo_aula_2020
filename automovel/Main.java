package automovel;

class Main {
	public static void main(String[] args) {

		Direcao objDirecao = new Direcao();

		objDirecao.setCor("Marron");

		Motor objMoto = new Motor();

		objMoto.setPotencia("2.0");
		

		Automovel objAuto = new Automovel();

		objAuto.setDirecao(objDirecao);
		objAuto.setMotor(objMoto);

		System.out.println(objAuto.getDirecao().getCor());
		System.out.println(objAuto.getMotor().getPotencia());

	}
}