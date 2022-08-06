package br.com.matheliasc.biblioteca.controller;

import br.com.matheliasc.biblioteca.controller.dto.EditoraDTO;
import br.com.matheliasc.biblioteca.controller.form.EditoraForm;
import br.com.matheliasc.biblioteca.model.Editora;
import br.com.matheliasc.biblioteca.repository.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/editoras")
public class EditoraController {

    @Autowired
    private EditoraRepository editoraRepository;

    @GetMapping
    public ResponseEntity<List<EditoraDTO>> listaEditora(){
        List<Editora> listaEditoras = editoraRepository.findAll();
        return ResponseEntity.ok(listaEditoras.stream().map(EditoraDTO::new).collect(Collectors.toList()));
    }

    @PostMapping
    public ResponseEntity<EditoraDTO> gravaEditora(@RequestBody @Valid EditoraForm editoraForm, UriComponentsBuilder uriBuilder){
        Editora editora = editoraRepository.save(editoraForm.converterFormParaEditora());
        URI uri = uriBuilder.path("/editoras/{id}").buildAndExpand(editora.getId()).toUri();
        return ResponseEntity.created(uri).body(new EditoraDTO(editora));
    }
}
