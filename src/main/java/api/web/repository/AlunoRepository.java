package api.web.repository;

import api.web.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    //Query Method
    List<Aluno> findByNomeContaining(String nome);

    //Query Method

    List<Aluno> findByIdadeGreaterThan(Integer idade);

    List<Aluno> findByNotaPrimeiroSemestreGreaterThan(Integer nota);

    List<Aluno> findByNomeProfessor(String nomeProfessor);

    @Query("SELECT a FROM Aluno a WHERE a.nome LIKE %:nome%")
    List<Aluno> filtrarPorNome(@Param("nome") String nome);

}
