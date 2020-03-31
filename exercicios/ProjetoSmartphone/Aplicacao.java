
public class Aplicacao {

	public static void main(String[] args) {
		
		Smartphone s1 = new Smartphone("Samsung S10");
		Tela t1 = new Tela(6.1, "3040x1440");
		RAM r1 = new RAM("DDR3",6);
		Processador p1 = new Processador("Samsung","Exynos 9820", 2.7);
		Bateria b1 = new Bateria(3400);
		Camera c1 = new Camera(10);
		
		s1.imprimirDados();
		t1.imprimirDados();
		r1.imprimirDados();
		p1.imprimirDados();
		b1.imprimirDados();
		c1.imprimirDados();
		
		Smartphone s2 = new Smartphone("Iphone 11");
		Tela t2 = new Tela(6.1, "3840x2160");
		RAM r2 = new RAM("DDR3",4);
		Processador p2 = new Processador("Apple", "A13 Bionic", 2.1);
		Bateria b2 = new Bateria(3046);
		Camera c2 = new Camera(12);
		
		s2.imprimirDados();
		t2.imprimirDados();
		r2.imprimirDados();
		p2.imprimirDados();
		b2.imprimirDados();
		c2.imprimirDados();
		

	}

}
