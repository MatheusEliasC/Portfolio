package br.com.matheliasc.biblioteca.model;

import br.com.matheliasc.biblioteca.model.enums.GeneroAutor;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private GeneroAutor genero;
    private String cpf;
    private Integer idade;
    private String email;
    private String contato;
    private String website;

    @OneToMany(mappedBy = "autores")
    private List<Livro> livros = new ArrayList<>();
}