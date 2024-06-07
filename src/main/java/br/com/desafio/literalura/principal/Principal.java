package br.com.desafio.literalura.principal;

import br.com.desafio.literalura.dto.LivroDTO;
import br.com.desafio.literalura.dto.ResultsDTO;
import br.com.desafio.literalura.model.Livro;
import br.com.desafio.literalura.service.ConsumoAPI;
import br.com.desafio.literalura.service.ConverterDados;

import java.util.Scanner;

public class Principal {
    private final Scanner scanner = new Scanner(System.in);
    private final ConsumoAPI api = new ConsumoAPI();
    private ConverterDados conversor = new ConverterDados();
    private final String endereco = "http://gutendex.com/books/?search=";

    public void menu() {
        var opcao = -1;
        while (opcao != 0) {
            System.out.println("Escolha uma das opções abaixo: ");
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
        }
    }

    private void buscarLivroPorTitulo() {
        System.out.println("Insira o nome do livro: ");
        var buscaLivroPorNome = scanner.nextLine();
        var json = api.consumirApi(endereco + buscaLivroPorNome.replace(" ", "%20"));

        LivroDTO dadosLivros = conversor.obterDados(json, LivroDTO.class);

        if (dadosLivros.resultados() != null && !dadosLivros.resultados().isEmpty()) {
            ResultsDTO livroBuscado = dadosLivros.resultados().get(0);
            Livro livro = new Livro(livroBuscado);
            System.out.println(livro);
        } else {
            System.out.println("Nenhum livro encontrado.");
        }

    }

    private void listarLivrosRegistrados() {}

    private void listarAutoresRegistrados() {}

    private void listarAutoresVivosPorIdiomas() {}

    private void livrosPorIdioma() {}
}
