package universidade;

import java.util.ArrayList;
import java.util.List;

class Disciplina {
    private int _duracao;
    private Professor _professorResponsavel;
    private List<Aluno> _alunos;
    private String _nome;

    public Disciplina(String nome) {
        this._alunos = new ArrayList<Aluno>();
        this._nome = nome;
    }

    public void definirDuracao(int duracaoEmAnos) {
        this._duracao = duracaoEmAnos;
    }

    public int obterDuracao() {
        return this._duracao;
    }

    public void adicionarProfessor(Professor professor) {
        this._professorResponsavel = professor;
    }

    public Professor obterProfessor() {
        return this._professorResponsavel;
    }

    public void adicionarAluno(Aluno aluno) {
        if (this._alunos.contains(aluno))
            throw new Error("O aluno " + aluno.obterNome() + "(RA " + aluno.obterRA()
                    + ") já está cadastrado nesta disciplina");
        this._alunos.add(aluno);
    }

    public void definirNome(String nome) {
        this._nome = nome;
    }

    public String obterNome() {
        return this._nome;
    }

    public Aluno[] obterAlunos() {
        return this._alunos.toArray(new Aluno[this._alunos.size()]);
    }
}