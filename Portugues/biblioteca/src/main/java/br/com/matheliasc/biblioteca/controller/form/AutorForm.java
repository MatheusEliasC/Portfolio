package br.com.matheliasc.biblioteca.controller.form;

import br.com.matheliasc.biblioteca.model.Autor;
import br.com.matheliasc.biblioteca.model.enums.GeneroAutor;
import br.com.matheliasc.biblioteca.config.util.ValidateString;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class AutorForm {

    @NotBlank
    private String nome;
    @ValidateString(acceptedValues = {"MASCULINO","FEMININO","OUTRO_A"})
    private GeneroAutor genero;
    @CPF
    private String cpf;
    @NotNull
    private Integer idade;
    @NotBlank
    private String email;
    @NotBlank
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
