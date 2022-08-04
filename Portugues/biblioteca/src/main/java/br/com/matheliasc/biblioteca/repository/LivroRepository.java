package br.com.matheliasc.biblioteca.repository;

import br.com.matheliasc.biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro,Long> {}
