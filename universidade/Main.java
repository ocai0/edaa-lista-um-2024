/**
 * Levando em consideração uma universidade, modele uma entidade Aluno, Universidade, Professor, Disciplina. 
 * Faça alguns métodos do seu gosto. Imprima os dados de uma instância do livro na classe principal do seu programa.
 */
package universidade;

public class Main {
    public static void main(String[] args) {
        Universidade una = new Universidade();
        Disciplina cienciaComputacao = new Disciplina("Ciência da Computação");
        cienciaComputacao.definirDuracao(4);
        Professor pedro = new Professor("Pedro Alvares", 34);
        cienciaComputacao.adicionarProfessor(pedro);
        una.adicionarDisciplina(cienciaComputacao);

        for (Aluno aluno : Main.obterAlunos())
            cienciaComputacao.adicionarAluno(aluno);

        System.out.println("Faculdade UNA");
        System.out.println("Cursos oferecidos:\n");
        for (Disciplina curso : una.obterCursos()) {
            System.out.println("\t" + curso.obterNome());
            System.out.println();
            System.out.println("\tProfessor Responsável: " + curso.obterProfessor().obterNome());
            System.out.println("\tAlunos matriculados:");
            Table table = new Table();
            Column t_RA = table.addColumn("RA");
            Column t_nomeAlunos = table.addColumn("Nome Aluno");
            Column t_periodo = table.addColumn("Período Atual");
            for (Aluno aluno : curso.obterAlunos()) {
                t_RA.push(aluno.obterRA());
                t_nomeAlunos.push(aluno.obterNome());
                t_periodo.push(String.valueOf(aluno.obterPeriodo()));
            }
            table.print("\t");
        }

        System.out.println();
    }

    public static Aluno[] obterAlunos() {
        Aluno[] alunos = new Aluno[10];
        alunos[0] = new Aluno("Horacio Gomes Santos", "81263752", 2);
        alunos[1] = new Aluno("Leticia Arruda", "82716253", 3);
        alunos[2] = new Aluno("Marcos Cassio", "71625341", 1);
        alunos[3] = new Aluno("Rodinei Silva", "92817263", 1);
        alunos[4] = new Aluno("Aline Moura", "72625343", 2);
        alunos[5] = new Aluno("Jessica Montes", "76753642", 3);
        alunos[6] = new Aluno("Luciana Mendes", "81267341", 6);
        alunos[7] = new Aluno("Oracio Lima", "91267423", 3);
        alunos[8] = new Aluno("Celio Lavada", "01274222", 5);
        alunos[9] = new Aluno("Rubens Richelo", "21637812", 2);
        return alunos;
    }
}