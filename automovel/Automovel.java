package automovel;

class Automovel {
	
	private Direcao direcao;
	private Motor motor;

	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

	public Direcao getDirecao() {
		return this.direcao;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Motor getMotor() {
		return this.motor;
	}

}