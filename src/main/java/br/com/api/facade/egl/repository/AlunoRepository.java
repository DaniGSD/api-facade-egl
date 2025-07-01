package br.com.api.facade.egl.repository;

import br.com.api.facade.egl.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {}
