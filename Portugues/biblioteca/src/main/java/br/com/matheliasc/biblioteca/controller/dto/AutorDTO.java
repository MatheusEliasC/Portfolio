package br.com.matheliasc.biblioteca.controller.dto;

import br.com.matheliasc.biblioteca.model.Autor;
import br.com.matheliasc.biblioteca.model.Livro;
import br.com.matheliasc.biblioteca.model.enums.GeneroAutor;
import lombok.Data;

import java.util.List;

@Data
public class AutorDTO {

    private Long id;
    private String nome;
    private GeneroAutor genero;
    private String cpf;
    private Integer idade;
    private String email;
    private String contato;
    private String website;
    private List<Livro> livros;

    public AutorDTO (Autor autor){
        this.id = autor.getId();
        this.nome = autor.getNome();
        this.genero = autor.getGenero();
        this.cpf = autor.getCpf();
        this.idade = autor.getIdade();
        this.email = autor.getEmail();
        this.contato = autor.getContato();
        this.website = autor.getWebsite();
        this.livros = autor.getLivros();
    }
}
