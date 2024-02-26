package cachorro;

import java.util.Random;

class Cachorro extends Animal {
    private String _nome;
    private String _raca;
    private int _idade;

    public Cachorro(String nome, String raca, int idade) {
        this._nome = nome;
        this.setRaca(raca);
        this.setIdade(idade);
        Random gerador = new Random();

        this._id = gerador.nextInt();
    }

    public void setRaca(String raca) {
        this._raca = raca;
    }

    public void setIdade(int idade) {
        if (idade < 0)
            throw new Error("Idade não pode ser menor do que 0");
        this._idade = idade;
    }

    public String getNome() {
        return this._nome;
    }

    public String getRaca() {
        return this._raca;
    }

    public int getIdade() {
        return this._idade;
    }

    public int getId() {
        return this._id;
    }

    public void print() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("ID: " + this.getId());
        System.out.println("Raça: " + this.getRaca());
        System.out.println("Idade: " + this.getIdade());

    }
}