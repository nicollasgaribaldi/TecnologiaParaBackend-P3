package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.alunoonline.api.repository.AlunoRepository;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public void criarAluno(Aluno aluno) {
        alunoRepository.save(aluno);
    }

    public List<Aluno> listarTodosAlunos() {
        return alunoRepository.findAll();
    }
    public Optional<Aluno> buscarAlunoPorId(Long id){
        return alunoRepository.findById(id);
    }

    public void deleteAlunoPorId(long id) {
        alunoRepository.deleteById(id);
    }

    public void atualizarAlunoPorId(long id, Aluno aluno) {
        alunoRepository.findById(id);
    }
}