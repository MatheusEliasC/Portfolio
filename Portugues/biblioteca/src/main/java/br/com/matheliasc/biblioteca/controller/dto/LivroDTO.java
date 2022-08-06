package br.com.matheliasc.biblioteca.controller.dto;

import br.com.matheliasc.biblioteca.model.Livro;
import lombok.Data;

import java.time.LocalDate;

@Data
public class LivroDTO {

    private Long id;
    private String titulo;
    private String subtitulo;
    private String linguagem;
    private String categoria;
    private Integer quantidadePaginas;
    private Integer quantidadeCapitulos;
    private LocalDate dataPublicacao;
    private String posicao;
    private String preco;
    private String nota;

    public LivroDTO(Livro livro){
        this.id = livro.getId();
        this.titulo = livro.getTitulo();
        this.subtitulo = livro.getSubtitulo();
        this.linguagem = livro.getLinguagem();
        this.categoria = livro.getCategoria();
        this.quantidadePaginas = livro.getQuantidadePaginas();
        this.quantidadeCapitulos = livro.getQuantidadeCapitulos();
        this.dataPublicacao = livro.getDataPublicacao();
        this.posicao = livro.getPosicao();
        this.preco = livro.getPreco();
        this.nota = livro.getNota();
    }
}
