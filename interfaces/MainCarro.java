package interfaces;

public class MainCarro {
    public static void main(String[] args) {
        Civic objCivic = new Civic();

        System.out.println(objCivic.getRPM());
        System.out.println(objCivic.getPeso());
        System.out.println(objCivic.getPotencia());
        System.out.println(objCivic.getTipo());
    }
}
