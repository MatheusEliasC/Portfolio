package br.com.matheliasc.biblioteca.controller;

import br.com.matheliasc.biblioteca.repository.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EditoraController {

    @Autowired
    private EditoraRepository editoraRepository;

    
}
