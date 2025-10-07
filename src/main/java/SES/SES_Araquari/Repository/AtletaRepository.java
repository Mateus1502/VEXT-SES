package SES.SES_Araquari.Repository;

import SES.SES_Araquari.Entity.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtletaRepository extends JpaRepository<Atleta, Long> {
    List<Atleta>findAtletaByNome(String nome);
    Atleta findAtletaByCpf(String cpf);
}
