package polimorfismo.ex;

import java.util.Scanner;

public class Sala {
    public Aluno[] alunos;

    Sala() {

    //	Scanner leitor = new Scanner(System.in);
        this.alunos = new Aluno[30];
        for (int i = 0; i < 30; i++) {
            alunos[i] = new Aluno();
		//	alunos[i].setNome(leitor.next());
		}
    }
}
