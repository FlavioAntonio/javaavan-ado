package oo.composicao.copy;

import java.util.ArrayList;

public class Aluno {
	String nome;
	final ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPornome(String nome) {
		for (Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
}
