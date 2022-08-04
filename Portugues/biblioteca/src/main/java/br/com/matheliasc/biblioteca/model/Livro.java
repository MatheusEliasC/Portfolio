package br.com.matheliasc.biblioteca.model;

import br.com.matheliasc.biblioteca.model.enums.SituacaoLivro;
import br.com.matheliasc.biblioteca.model.enums.TipoMidiaLivro;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@RequiredArgsConstructor
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Enumerated(EnumType.STRING)
    private final SituacaoLivro situacao = SituacaoLivro.DISPONIVEL;
    @Enumerated(EnumType.STRING)
    private final TipoMidiaLivro tipoMidia;

    @OneToMany
    private List<Autor> autores = new ArrayList<>();
    @OneToOne
    private Editora editora;
}
