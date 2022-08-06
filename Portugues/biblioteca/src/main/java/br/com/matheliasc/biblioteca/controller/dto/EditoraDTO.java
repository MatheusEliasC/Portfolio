package br.com.matheliasc.biblioteca.controller.dto;

import br.com.matheliasc.biblioteca.model.Editora;

public class EditoraDTO {

    private Long id;
    private String nome;
    private String cnpj;
    private String email;
    private String contato;
    private String website;

    public EditoraDTO(Editora editora){
        this.id = editora.getId();
        this.nome = editora.getNome();
        this.cnpj = editora.getCnpj();
        this.email = editora.getEmail();
        this.contato = editora.getContato();
        this.website = editora.getWebsite();
    }

}
