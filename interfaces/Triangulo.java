package interfaces;

public class Triangulo implements FiguraGeometrica {
    String nomeTriangulo;
    int ladoA;
    int ladoB;
    int ladoC;
    int base;
    int altura;

    public void setNomeTriangulo(String nomeTriangulo) {
        this.nomeTriangulo = nomeTriangulo;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    public int getBase() {
        return base;
    }

    @Override
    public String getNomeFigura() {
        return this.nomeTriangulo;
    }

    @Override
    public int getArea() {
        return (base * altura) / 2;
    }

    @Override
    public int getPerimetro() {
        return ladoA + ladoB + ladoC;
    }
}
