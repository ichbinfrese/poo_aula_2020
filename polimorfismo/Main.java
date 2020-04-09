package polimorfismo;

public class Main {

	public static void main(String[] args) {

		Pessoa objPessoa = new Pessoa("Maria",123456789);
	//	objPessoa.setNome("Maria");
		//objPessoa.setRg(123456789);
		
		System.out.println("Nome: "+objPessoa.getNome());
		System.out.println("RG: "+ objPessoa.getRG());
		

	}

}
