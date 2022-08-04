package br.com.matheliasc.biblioteca.controller;

import br.com.matheliasc.biblioteca.model.Autor;
import br.com.matheliasc.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    @GetMapping("/autores")
    public List<Autor> listaAutor(){
        return autorRepository.findAll();
    }
}
