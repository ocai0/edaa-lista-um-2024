package pessoa_fisica;

class Pessoa {
    public static enum Vinculo {
        PAI,
        MAE,
        FILHO
    };

    private String _nome;
    private int _idade;
    private char _sexo;

    private Pessoa _pai;
    private Pessoa _mae;
    private Pessoa _filho;

    public Pessoa(String nome, int idade, char sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    public String toString() {
        String resultado = "\nDados sobre '" + this.getNome() + "'\n";
        resultado += "-------------------------------\n";
        resultado += "Nome: " + this.getNome() + "\n";
        resultado += "Idade: " + this.getIdade() + "\n";
        resultado += "Sexo: " + this.getSexo() + "\n";
        if (this._pai != null) {
            resultado += "Possui pai: " + this._pai.getNome();
        }
        if (this._mae != null) {
            resultado += "Possui mãe: " + this._mae.getNome();
        }
        if (this._filho != null) {
            resultado += "Possui filho: " + this._filho.getNome();
        }

        return resultado;
    }

    public void setNome(String nome) {
        if (nome == "")
            throw new Error("Nome precisa ser definido");
        this._nome = nome;
    }

    public String getNome() {
        return this._nome;
    }

    public void setIdade(int idade) {
        if (idade < 0)
            throw new Error("Idade precisa ser um valor maior ou igual a 0");
        this._idade = idade;
    }

    public int getIdade() {
        return this._idade;
    }

    public void setSexo(char sexo) {
        sexo = Character.toLowerCase(sexo);
        if (sexo != 'm' && sexo != 'f')
            throw new Error("Insira um valor válido. Valor enviado:" + sexo);
        this._sexo = sexo;
    }

    public String getSexo() {
        return this._sexo == 'm' ? "Masculino" : "Feminino";
    }

    public void vincular(Pessoa outro, Vinculo tipoVinculo) {
        switch (tipoVinculo) {
            case PAI:
                this.setPai(outro);
                break;
            case MAE:
                this.setMae(outro);
                break;
            case FILHO:
                this.setFilho(outro);
                break;
        }
    }

    public void setPai(Pessoa p) {
        this._pai = p;
    }

    public void setMae(Pessoa p) {
        this._mae = p;
    }

    public void setFilho(Pessoa p) {
        this._filho = p;
    }

    public String obterParentescos() {
        String resultado = "";
        if (this._pai != null)
            resultado += "\nPossui pai registrado: " + this._pai.getNome();
        if (this._mae != null)
            resultado += "\nPossui mãe registrada: " + this._mae.getNome();
        if (this._filho != null)
            resultado += "\nPossui filho registrado: " + this._filho.getNome();
        return resultado;
    }
}