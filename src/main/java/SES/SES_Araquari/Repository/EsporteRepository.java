package SES.SES_Araquari.Repository;

import SES.SES_Araquari.Entity.Esporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EsporteRepository extends JpaRepository<Esporte, Integer> {

}
