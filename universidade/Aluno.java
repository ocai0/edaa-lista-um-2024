package universidade;

class Aluno {
    private String _nome;
    private String _RA;
    private int _periodo;

    public Aluno(String nome, String ra, int periodo) {
        this.definirNome(nome);
        this.definirRA(ra);
        this.definirPeriodo(periodo);
    }

    private void definirNome(String nome) {
        this._nome = nome;
    }

    public String obterNome() {
        return this._nome;
    }

    private void definirRA(String ra) {
        this._RA = ra;
    }

    public String obterRA() {
        return this._RA;
    }

    public void definirPeriodo(int periodo) {
        this._periodo = periodo;
    }

    public int obterPeriodo() {
        return this._periodo;
    }
}