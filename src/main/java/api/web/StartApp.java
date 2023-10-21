package api.web;

import api.web.repository.AlunoRepository;
import api.web.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Random;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private AlunoRepository repository;
    @Override
    public void run(String... args) throws Exception {
        List<Aluno> aluno = repository.findByNomeContaining("Hiago");
        for(Aluno a: aluno){
            System.out.println(a);
        }

        insereAlunosAleatorios();
    }
    private void insereAlunosAleatorios() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            Aluno aluno = new Aluno();
            aluno.setId(i + 1);
            aluno.setNome(geraNomeAleatorio());
            aluno.setIdade(random.nextInt(10) + 18);
            aluno.setNotaPrimeiroSemestre(random.nextInt(11));
            aluno.setNotaSegundoSemestre(random.nextInt(11));
            aluno.setNomeProfessor(geraNomeAleatorio());
            aluno.setNumeroSala(random.nextInt(20) + 1);

            repository.save(aluno);
        }
    }

    private String geraNomeAleatorio() {
        String[] nomes = {"João", "Maria", "Pedro", "Ana", "Lucas", "Mariana", "Carlos", "Beatriz", "Rafael", "Laura"};
        String[] sobrenomes = {"Silva", "Oliveira", "Santos", "Pereira", "Ferreira", "Rodrigues", "Almeida", "Lima", "Gomes", "Costa"};

        Random random = new Random();
        String nomeAleatorio = nomes[random.nextInt(nomes.length)] + " " + sobrenomes[random.nextInt(sobrenomes.length)];
        return nomeAleatorio;
    }
}
