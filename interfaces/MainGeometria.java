package interfaces;

public class MainGeometria {
    public static void main(String[] args) {
        Quadrado objQ = new Quadrado();

        objQ.setNomeQuadrado("AAA");
        objQ.setLado(4);

        System.out.printf(objQ.getNomeFigura());
        System.out.printf(""+objQ.getArea());
        System.out.println(objQ.getPerimetro());

        Triangulo objT = new Triangulo();

        objT.setNomeTriangulo("BBBB");
        objT.setAltura(10);
        objT.setLadoA(5);
        objT.setLadoB(5);
        objT.setLadoC(5);
        objT.setBase(4);

        System.out.printf(objT.getNomeFigura());
        System.out.printf(""+objT.getArea());
        System.out.println(objT.getPerimetro());

    }
}
