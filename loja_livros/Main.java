package loja_livros;

/**
 * Levando em consideração uma loja on-line de livros, modele uma entidade
 * Livro. Imprima os dados de uma instância do livro na classe principal do seu
 * programa.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Quantos livros há na vitrine: ");
        Scanner scanner = new Scanner(System.in);
        int qtdLivros = Integer.parseInt(scanner.nextLine());
        Livro[] vitrine = new Livro[qtdLivros];
        int index = 0;
        while (index < qtdLivros) {
            System.out.println("Registro livro " + (index + 1) + ":");
            Livro livro = new Livro();
            System.out.print("\tTítulo: ");
            livro.setTitulo(scanner.nextLine());
            System.out.print("\tAutores (separados por virgulas): ");
            livro.setAutores(scanner.nextLine());
            System.out.print("\tData de Publicação (Ex: 12/12/2012): ");
            livro.setDataPublicacao(scanner.nextLine());
            System.out.print("\tISBN (XXX-XX-XXXX-XXX-X): ");
            livro.setISBN(scanner.nextLine());
            vitrine[index++] = livro;
            System.out.println("Dados gravados com sucesso!\n\n");
        }
        System.out.println("Imprimindo todos os livros da vitrine:");
        System.out.println("--------------------------------------\n");
        for (Livro _livro : vitrine)
            System.out.println(_livro.toString());
        scanner.close();
    }

}