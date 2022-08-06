package br.com.matheliasc.biblioteca.model;

import br.com.matheliasc.biblioteca.model.enums.GeneroAutor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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