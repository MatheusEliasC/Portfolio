package br.com.matheliasc.biblioteca.controller;

import br.com.matheliasc.biblioteca.controller.dto.AutorDTO;
import br.com.matheliasc.biblioteca.controller.form.AutorForm;
import br.com.matheliasc.biblioteca.model.Autor;
import br.com.matheliasc.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    @GetMapping
    public List<AutorDTO> listaAutor(){
        List<Autor> listaAutores = autorRepository.findAll();
        return listaAutores.stream().map(AutorDTO::new).collect(Collectors.toList());
    }

    @PostMapping
    public ResponseEntity<AutorDTO> gravaAutor(@RequestBody AutorForm autorForm, UriComponentsBuilder uriBuilder){
            Autor autor = autorRepository.save(autorForm.converterFormParaAutor());
            URI uri = uriBuilder.path("/autores/{id}").buildAndExpand(autor.getId()).toUri();
            return ResponseEntity.created(uri).body(new AutorDTO(autor));
    }
}
