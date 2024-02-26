package loja_livros;

class InternationalStandardBookNumber {
    private String _prefixoEan;
    private String _areaIdiomatica;
    private String _identificadorEditor;
    private String _identificadorTitulo;
    private String _digitoVerificacao;

    public InternationalStandardBookNumber(String isbn) {
        this.extrair(isbn);
    }

    public void extrair(String linha) {
        String[] partes = linha.split("-");
        this._prefixoEan = partes[0];
        this._areaIdiomatica = partes[1];
        this._identificadorEditor = partes[2];
        this._identificadorTitulo = partes[3];
        this._digitoVerificacao = partes[4];
    }

    // Getters
    public String getEAN() {
        return this._prefixoEan;
    }

    public String getAreaIdiomatica() {
        return this._areaIdiomatica;
    }

    public String getEditor() {
        return this._identificadorEditor;
    }

    public String getTitulo() {
        return this._identificadorTitulo;
    }

    public String getDigitoVerificador() {
        return this._digitoVerificacao;
    }

    public String toString() {
        return this.getEAN() + "-" + this.getAreaIdiomatica() + "-" + this.getEditor() + "-" + this.getTitulo() + "-"
                + this.getDigitoVerificador();
    }
}