package loja_livros;

class Livro {
    private String _titulo;
    private String[] _autores;
    private int _anoPublicacao;
    private int _mesPublicacao;
    private int _diaPublicacao;
    private InternationalStandardBookNumber _isbn;

    public Livro() {
    }

    public String toString() {
        return "Informações sobre o livro '" + this._titulo + "':\n" +
                "---------------------------------------------------\n" +
                "Título: " + this._titulo + "\n" +
                ((this._autores.length < 2) ? "Autor: " : "Autores: ") + this.getAutores() + "\n" +
                "Data Publicação: " + this.getDataPublicacao() + "\n" +
                "ISBN: " + this.getISBN() + "\n";
    }

    public void setTitulo(String nextLine) {
        this._titulo = nextLine;
    }

    public void setAutores(String nextLine) {
        nextLine = nextLine.replaceAll(", ", ",");
        this._autores = nextLine.split(",");
    }

    public void setDataPublicacao(String nextLine) {
        String[] data = nextLine.split("/");
        this._diaPublicacao = Integer.parseInt(data[0]);
        this._mesPublicacao = Integer.parseInt(data[1]);
        this._anoPublicacao = Integer.parseInt(data[2]);
    }

    public void setISBN(String nextLine) {
        this._isbn = new InternationalStandardBookNumber(nextLine);
    }

    public String getAutores() {
        return String.join(", ", this._autores);
    }

    public String getISBN() {
        return this._isbn.toString();
    }

    public String getDataPublicacao() {
        return this._diaPublicacao + "/" + this._mesPublicacao + "/" + this._anoPublicacao;
    }

}
