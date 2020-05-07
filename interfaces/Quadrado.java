package interfaces;

public class Quadrado implements FiguraGeometrica {
    private String nomeQuadrado;
    private int lado;

    public void setNomeQuadrado(String nomeQuadrado) {
        this.nomeQuadrado = nomeQuadrado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        return this.nomeQuadrado;
    }

    @Override
    public int getArea() {
        return this.lado * this.lado;
    }

    @Override
    public int getPerimetro() {
        return lado * 4;
    }
}
