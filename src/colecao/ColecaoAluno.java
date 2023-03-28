package colecao;

import java.util.Arrays;

import attExemplo.Aluno;

public class ColecaoAluno {

	private Aluno[] aluno = new Aluno[10];
	int cont = 0;

	public void cadastrarAluno(Aluno aluno) {

		for (int cont = 0; cont < this.aluno.length; cont++) {

			if (this.aluno[cont] == null) {

				this.aluno[cont] = aluno;
				break;
			}
		}

	}

	public void cadastrarAlunoOtimizado(Aluno aluno) {
		this.aluno[cont] = aluno;
		this.cont++;
	}

	public Aluno[] retornoAluno() {

		return this.aluno;
	}
}
