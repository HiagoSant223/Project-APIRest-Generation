package api.web.model;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tab_aluno")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "user_id")
    private Integer id;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 3, nullable = false)
    private Integer idade;
    @Column(length = 2, nullable = false)
    private Integer notaPrimeiroSemestre;
    @Column(length = 2, nullable = false)
    private Integer notaSegundoSemestre;
    @Column(length = 50, nullable = false)
    private String nomeProfessor;
    @Column(length = 3, nullable = false)
    private Integer numeroSala;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getIdade(){
        return idade;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public Integer getNotaPrimeiroSemestre(){
        return notaPrimeiroSemestre;
    }

    public void setNotaPrimeiroSemestre(Integer notaPrimeiroSemestre){
        this.notaPrimeiroSemestre = notaPrimeiroSemestre;
    }

    public Integer getNotaSegundoSemestre(){
        return notaSegundoSemestre;
    }

    public void setNotaSegundoSemestre(Integer notaSegundoSemestre){
        this.notaSegundoSemestre = notaSegundoSemestre;
    }

    public String getNomeProfessor(){
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor){
        this.nomeProfessor = nomeProfessor;
    }

    public Integer getNumeroSala(){
        return numeroSala;
    }

    public void setNumeroSala(Integer numeroSala){
        this.numeroSala = numeroSala;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", notaPrimeiroSemestre=" + notaPrimeiroSemestre +
                ", notaSegundoSemestre=" + notaSegundoSemestre +
                ", nomeProfessor='" + nomeProfessor + '\'' +
                ", numeroSala=" + numeroSala +
                '}';
    }
}
