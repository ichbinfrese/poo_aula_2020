package exer;

public class Bateria {
	private float capacidade;

	public Bateria(float capacidade) {
		this.capacidade = capacidade;
	}

	public Bateria() {
	}

	public float getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(float capacidade) {
		this.capacidade = capacidade;
	}

    public static class Processador {
        private String marca;
        private String modelo;
        private double velocidade;

        public Processador(String marca, String modelo, double velocidade) {
            this.marca = marca;
            this.modelo = modelo;
            this.velocidade = velocidade;
        }

        public Processador() {
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public double getVelocidade() {
            return velocidade;
        }

        public void setVelocidade(double velocidade) {
            this.velocidade = velocidade;
        }

    }
}
