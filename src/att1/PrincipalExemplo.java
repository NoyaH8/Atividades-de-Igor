package att1;

import java.util.Arrays;
import java.util.Scanner;

import attExemplo.Aluno;
import colecao.ColecaoAluno;

public class PrincipalExemplo {

	public static void main(String[] args) {

		ColecaoAluno ca = new ColecaoAluno();
		Scanner in = new Scanner(System.in);

		for (int cont = 0; cont < 10; cont++) {

			Aluno a = new Aluno();

			System.out.println("Digite seu nome do aluno:");
			a.setNome(in.nextLine());

			System.out.println("Digite o seu CPF:");
			a.setCpf(in.nextLine());

			System.out.println("Digite sua matricula:");
			a.setMatricula(in.nextLine());

			ca.cadastrarAluno(a);

		}

		System.out.println(Arrays.toString(ca.retornoAluno()));

	}

}
