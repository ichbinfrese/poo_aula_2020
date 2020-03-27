package classes_objetos;

public class Principal {

	public static void main(String[] args) {

		
	   Carro objCarro = new Carro();

	   objCarro.setCor("Azul");
	   System.out.println(objCarro.getCor());

		
		Computador objC1 = new Computador();
		
		objC1.setModelo("Dell");
		
		System.out.println(objC1.getModelo());
		
		
	}

}
