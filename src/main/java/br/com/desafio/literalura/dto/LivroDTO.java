package br.com.desafio.literalura.dto;

import br.com.desafio.literalura.model.Autor;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LivroDTO(@JsonAlias("title") String titulo,
                       @JsonAlias("authors") Autor autor,
                       @JsonAlias("languages") String idioma,
                       @JsonAlias("download_count") String numeroDownloads) {

//    Fazer ENUM de idiomas
}
