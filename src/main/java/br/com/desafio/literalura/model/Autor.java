package br.com.desafio.literalura.model;

import br.com.desafio.literalura.dto.AutorDTO;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "autores")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataNascimento;
    private String dataFalecimento;

    @OneToMany
    private List<Livro> livros = new ArrayList<>();

    public Autor() {}

    public Autor(AutorDTO autor) {
        this.nome = autor.nome();
        this.dataNascimento = autor.dataNascimento();
        this.dataFalecimento = autor.dataFalecimento();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataFalecimento() {
        return dataFalecimento;
    }

    public void setDataFalecimento(String dataFalecimento) {
        this.dataFalecimento = dataFalecimento;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return "---------------Autor---------------" +
                "\nnome: " + nome +
                "\nData de Nascimento: " + dataNascimento  +
                "\nData de Falecimento: " + dataFalecimento +
                "\nLivro: " + livros.stream()
                .map(livros -> livros.getTitulo())
                .collect(Collectors.toList()) +
                "\n-----------------------------------";

    }
}
