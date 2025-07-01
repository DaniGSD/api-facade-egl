package br.com.api.facade.egl.controller;

import br.com.api.facade.egl.dtos.request.CreateAlunoRequestDTO;
import br.com.api.facade.egl.dtos.request.UpdateAlunoRequestDTO;
import br.com.api.facade.egl.dtos.response.AlunoResponseDTO;
import br.com.api.facade.egl.entities.Aluno;
import br.com.api.facade.egl.repository.AlunoRepository;
import br.com.api.facade.egl.service.mapper.AlunoMapper;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/alunos")
@RequiredArgsConstructor
public class AlunoController {

  private final AlunoRepository alunoRepository;

  public void saveAluno(CreateAlunoRequestDTO requestDTO) {
    Aluno aluno = AlunoMapper.mapToCreateAluno(requestDTO);
    alunoRepository.save(aluno);
  }

  public String updateAluno(UpdateAlunoRequestDTO requestDTO) {
    Optional<Aluno> aluno = alunoRepository.findById(requestDTO.getId());
    if (aluno.isPresent()) {
      Aluno alunoUpd = AlunoMapper.mapToUpdateAluno(requestDTO);
      alunoRepository.save(alunoUpd);
      return "Aluno atualizado com sucesso: " + requestDTO.getId();
    } else {
      return "Aluno não encontrado: " + requestDTO.getId();
    }
  }
}
