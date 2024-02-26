package universidade;

class Professor {
    private String _nome;
    private int _idade;

    public Professor(String nome, int idade) {
        this._nome = nome;
        this._idade = idade;
    }

    public int obterIdade() {
        return this._idade;
    }

    public String obterNome() {
        return this._nome;
    }
}