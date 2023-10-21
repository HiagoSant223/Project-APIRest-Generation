package api.web.controller;

import api.web.model.Aluno;
import api.web.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping("/")
    public Aluno createAluno(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @PutMapping("/{id}")
    public Aluno updateAluno(@PathVariable Integer id, @RequestBody Aluno alunoDetails) {
        Aluno aluno = alunoRepository.findById(id).orElse(null);

        if (aluno != null) {
            aluno.setId(alunoDetails.getId());
            aluno.setNome(alunoDetails.getNome());
            aluno.setIdade(alunoDetails.getIdade());
            aluno.setNotaPrimeiroSemestre(alunoDetails.getNotaPrimeiroSemestre());
            aluno.setNotaSegundoSemestre(alunoDetails.getNotaSegundoSemestre());
            aluno.setNomeProfessor(alunoDetails.getNomeProfessor());
            aluno.setNumeroSala(alunoDetails.getNumeroSala());

            return alunoRepository.save(aluno);
        }

        return null;
    }

    @GetMapping("/")
    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Aluno getAlunoById(@PathVariable Integer id) {
        return alunoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteAluno(@PathVariable Integer id) {
        alunoRepository.deleteById(id);
    }
}