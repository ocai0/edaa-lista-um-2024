package cachorro;

class Animal {
    int _id;
    String _tipo;
    String _habitat;

    public void setTipo(String tipo) {
        tipo = tipo.toLowerCase();
        if (!tipo.equals("selvagem") || !tipo.equals("domestico"))
            throw new Error("O tipo informado não é 'domestico' ou 'selvagem'. Recebido: '" + tipo + "'");
        this._tipo = tipo;
    }

    public String getTipo() {
        return this._tipo;
    }

    public void setHabitat(String habitat) {
        habitat = habitat.toLowerCase();
        if (!habitat.equals("terrestre") || !habitat.equals("aquatico") || !habitat.equals("aereo"))
            throw new Error(
                    "O habitat informado não é 'terrestre', 'aquatico' ou 'aereo'. Recebido: '" + habitat + "'");
        this._habitat = habitat;
    }

    public String getHabitat() {
        return this._habitat;
    }
}