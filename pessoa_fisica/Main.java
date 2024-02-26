/*
 * Levando em consideração uma pessoa física, modele uma entidade Pessoa. 
 * Imprima os dados de uma instância de pessoa na classe principal do seu programa.
 */
package pessoa_fisica;

public class Main {
    public static void main(String[] args) {
        Pessoa marcia = new Pessoa("Márcia", 34, 'F');
        Pessoa joao = new Pessoa("João", 65, 'M');
        marcia.vincular(joao, Pessoa.Vinculo.PAI);

        System.out.println(marcia.toString());

    }
}
