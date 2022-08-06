package br.com.matheliasc.biblioteca.controller;

import br.com.matheliasc.biblioteca.controller.dto.LivroDTO;
import br.com.matheliasc.biblioteca.model.Livro;
import br.com.matheliasc.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    public ResponseEntity<List<LivroDTO>> listaLivro(){
        List<Livro> listaLivros = livroRepository.findAll();
        return ResponseEntity.ok(listaLivros.stream().map(LivroDTO::new).collect(Collectors.toList()));    }
}
