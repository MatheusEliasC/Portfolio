package br.com.matheliasc.biblioteca.controller;

import br.com.matheliasc.biblioteca.controller.dto.AutorDTO;
import br.com.matheliasc.biblioteca.model.Autor;
import br.com.matheliasc.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    @GetMapping("/autores")
    public List<AutorDTO> listaAutor(){
        List<Autor> listaAutores = autorRepository.findAll();
        return listaAutores.stream().map(AutorDTO::new).collect(Collectors.toList());
    }
}
