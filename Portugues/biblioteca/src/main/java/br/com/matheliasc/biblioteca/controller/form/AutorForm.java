package br.com.matheliasc.biblioteca.controller.form;

import br.com.matheliasc.biblioteca.model.Autor;
import br.com.matheliasc.biblioteca.model.enums.GeneroAutor;
import lombok.Data;

@Data
public class AutorForm {

    private String nome;
    private GeneroAutor genero;
    private String cpf;
    private Integer idade;
    private String email;
    private String contato;
    private String website;

    public Autor converterFormParaAutor(){
        return Autor.builder()
                .nome(this.nome)
                .genero(this.genero)
                .cpf(this.cpf)
                .idade(this.idade)
                .email(this.email)
                .contato(this.contato)
                .website(this.website)
                .build();
    }

}
