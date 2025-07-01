package br.com.api.facade.egl.service;

import br.com.api.facade.egl.dtos.request.CreateAlunoRequestDTO;
import br.com.api.facade.egl.dtos.response.AlunoResponseDTO;
import br.com.api.facade.egl.entities.Aluno;
import br.com.api.facade.egl.repository.AlunoRepository;
import br.com.api.facade.egl.service.mapper.AlunoMapper;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlunoService {

  private final AlunoRepository alunosRepository;

  public void saveAluno(CreateAlunoRequestDTO requestDTO) {
    Aluno aluno = AlunoMapper.mapToCreateAluno(requestDTO);
    alunosRepository.save(aluno);
  }

}
