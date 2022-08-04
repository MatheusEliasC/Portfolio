package br.com.matheliasc.biblioteca.repository;

import br.com.matheliasc.biblioteca.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor,Long> {}
