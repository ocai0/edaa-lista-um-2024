package cachorro;

/**
 * Modele uma entidade Animal e uma entidade Cachorro.
 * Animal contém os atributos privados Id, Tipo (selvagem, doméstico) e
 * Habitat(terrestre, aquático e aéreo).
 * Cachorro herda as características de Animal e possui os atributos privados:
 * Nome, Raça e idade.
 * Crie os métodos necessários.
 * Crie também os “gets” e “sets” para ambas entidades.
 * Imprima os dados de uma instância do “Cachorro.java” na classe principal do
 * seu programa.
 */

public class Main {
    public static void main(String[] args) {
        Cachorro cao1 = new Cachorro("Thor", "Bulldog", 5);
        Cachorro cao2 = new Cachorro("Rebeccão", "Salsicha", 12);

        System.out.println("------------------------------");
        cao1.print();
        System.out.println("------------------------------");
        cao2.print();
    }
}