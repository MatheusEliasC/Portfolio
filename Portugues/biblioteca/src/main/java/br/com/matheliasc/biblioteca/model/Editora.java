package br.com.matheliasc.biblioteca.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
@Entity
public class Editora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cnpj;
    private String email;
    private String contato;
    private String website;

    @OneToMany(mappedBy = "editora")
    private List<Livro> livros = new ArrayList<>();

}
