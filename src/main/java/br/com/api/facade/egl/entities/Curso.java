package br.com.api.facade.egl.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "curso")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Curso {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nomeCurso", nullable = false)
  private String nomeCurso;

  @Column(name = "nota")
  private Integer nota;

  @Column(name = "nomeProfessor", nullable = false)
  private String nomeProfessor;

  @Column(name = "grau", nullable = false)
  private String grau;

  @Column(name = "horaCriacao", nullable = false)
  private String horaCriacao;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_aluno")
  private Aluno aluno;

}