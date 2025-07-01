package br.com.api.facade.egl.repository;

import br.com.api.facade.egl.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursosRepository extends JpaRepository<Curso, Long> {}
