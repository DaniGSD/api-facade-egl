package br.com.api.facade.egl.service;

import static br.com.api.facade.egl.service.mapper.CursoMapper.mapToUpdateCurso;
import static br.com.api.facade.egl.service.mapper.CursoResponseDtoMapper.mapToCursoResponseDto;
import static br.com.api.facade.egl.service.mapper.CursoResponseDtoMapper.mapToCursoResponseDtoList;

import br.com.api.facade.egl.dtos.request.CreateCursoRequestDTO;
import br.com.api.facade.egl.dtos.request.UpdateCursoRequestDTO;
import br.com.api.facade.egl.dtos.response.CursoResponseDTO;
import br.com.api.facade.egl.entities.Curso;
import br.com.api.facade.egl.repository.CursosRepository;
import br.com.api.facade.egl.service.mapper.CursoMapper;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CursoService {

  private final CursosRepository cursosRepository;

  public void saveCurso(CreateCursoRequestDTO requestDTO) {
    Curso curso = CursoMapper.mapToCreateCurso(requestDTO);
    cursosRepository.save(curso);
  }

  public String updateCurso(UpdateCursoRequestDTO requestDTO) {
    Optional<Curso> curso = cursosRepository.findById(requestDTO.getId());
    if (curso.isPresent()) {
      Curso cursoupd = mapToUpdateCurso(requestDTO);
      cursosRepository.save(cursoupd);
      return "Curso atualizado com sucesso: " + requestDTO.getId();
    } else {
      return "Curso não encontrado: " + requestDTO.getId();
    }
  }

  public List<CursoResponseDTO> getAllCursos() {
    List<Curso> cursoList = cursosRepository.findAll();
    return mapToCursoResponseDtoList(cursoList);
  }

  public CursoResponseDTO getByIdCurso(Long id) {
    Optional<Curso> curso = cursosRepository.findById(id);
    if (curso.isPresent()) {
      return mapToCursoResponseDto(curso.get());
    } else {
      CursoResponseDTO responseDTO = new CursoResponseDTO();
      responseDTO.setMesage("Curso não encontrado: " + id);
      return responseDTO;
    }
  }

  public String deleteCurso(Long id){
    Optional <Curso> curso = cursosRepository.findById(id);
    if(curso.isPresent()){
      cursosRepository.deleteById(id);
      return "Curso deletado com sucesso: " + id;
    }else{
      return "Curso não encontrado: " + id;
    }



  }

}
