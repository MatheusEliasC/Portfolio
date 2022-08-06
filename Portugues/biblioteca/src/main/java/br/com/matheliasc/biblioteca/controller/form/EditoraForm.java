package br.com.matheliasc.biblioteca.controller.form;

import br.com.matheliasc.biblioteca.model.Editora;
import lombok.Data;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.validation.constraints.NotBlank;

@Data
public class EditoraForm {

    @NotBlank
    private String nome;
    @CNPJ
    private String cnpj;
    @NotBlank
    private String email;
    @NotBlank
    private String contato;
    @NotBlank
    private String website;

    public Editora converterFormParaEditora(){
        return Editora.builder()
                .nome(this.nome)
                .cnpj(this.cnpj)
                .email(this.email)
                .contato(this.contato)
                .website(this.website)
                .build();
    }

}
