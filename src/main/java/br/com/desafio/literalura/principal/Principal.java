package br.com.desafio.literalura.principal;

import br.com.desafio.literalura.service.ConsumoAPI;

import java.util.Scanner;

public class Principal {
    private final Scanner scanner = new Scanner(System.in);
    private final ConsumoAPI api = new ConsumoAPI();
    private final String endereco = "https://gutendex.com/books";

    public void menu() {
        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                    1 - Buscar livro por título
                    2 - Listar livros registrados
                    3 - Listar autores registrados
                    4 - Listar autores vivos em um determinado idomas
                    5 - Listar livros em um determinado idioma
                    0 - Sair
                    """;

            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    buscarLivroPorTitulo();
                    break;
                case 2:
                    listarLivrosRegistrados();
                    break;
                case 3:
                    listarAutoresRegistrados();
                    break;
                case 4:
                    listarAutoresVivosPorIdiomas();
                    break;
                case 5:
                    livrosPorIdioma();
                    break;
                case 0:
                    System.out.println("Saido...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

//            var json = api.consumirApi(endereco);
//            System.out.println(json);

        }
    }

    private void buscarLivroPorTitulo() {}
    private void listarLivrosRegistrados() {}
    private void listarAutoresRegistrados() {}
    private void listarAutoresVivosPorIdiomas() {}
    private void livrosPorIdioma() {}
}
