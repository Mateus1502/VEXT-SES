package SES.SES_Araquari.Repository;

import SES.SES_Araquari.Entity.EquipeTreinador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface EquipeTreinadorRepository extends JpaRepository<EquipeTreinador, Long> {
    List<EquipeTreinador> findByNome(@RequestParam String nome);
    EquipeTreinador findEquipeTreinadorByCpf(@RequestParam String cpf);
}
