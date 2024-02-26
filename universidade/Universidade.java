package universidade;

import java.util.ArrayList;
import java.util.List;

class Universidade {
    private List<Disciplina> _disciplinas = new ArrayList<Disciplina>();

    public void adicionarDisciplina(Disciplina _disciplina) {
        this._disciplinas.add(_disciplina);
    }

    public Disciplina[] obterCursos() {
        return this._disciplinas.toArray(new Disciplina[this._disciplinas.size()]);
    }

}
