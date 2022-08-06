package br.com.matheliasc.biblioteca.controller;

import br.com.matheliasc.biblioteca.controller.dto.EditoraDTO;
import br.com.matheliasc.biblioteca.model.Editora;
import br.com.matheliasc.biblioteca.repository.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/editoras")
public class EditoraController {

    @Autowired
    private EditoraRepository editoraRepository;

    @GetMapping
    public List<EditoraDTO> listaEditora(){
        List<Editora> listaEditoras = editoraRepository.findAll();
        return listaEditoras.stream().map(EditoraDTO::new).collect(Collectors.toList());
    }
}
