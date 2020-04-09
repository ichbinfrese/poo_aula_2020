package polimorfismo;

public class Nome {
 private double velocidade;
 private double aceleracao;
 
 public void mover() {
	 System.out.println("Mover Nome");
 }
 
 public void velocidade(int vel) {
	 this.velocidade = vel;
 }
 

 public void velocidade(double vel) {
	 this.velocidade = vel;
 }

 public void velocidade(float vel, double ac) {
	 this.velocidade = vel;
	 this.aceleracao = ac;
 }
}
