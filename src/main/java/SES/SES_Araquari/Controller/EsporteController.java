package SES.SES_Araquari.Controller;

import SES.SES_Araquari.Entity.Esporte;
import SES.SES_Araquari.Repository.EsporteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/esportes")
public class EsporteController {
    private final EsporteRepository esporteRepository;

    public EsporteController(EsporteRepository esporteRepository) {
        this.esporteRepository = esporteRepository;
    }

    //Endpoint para cadastrar um esporte
    @PostMapping
    public Esporte cadastrarEsporte(@RequestBody Esporte esporte){
        return esporteRepository.save(esporte);
    }
    /// endpoint para visualizar todos os esportes cadastrados
    @GetMapping
    public List<Esporte> listarEsportes(){
        return esporteRepository.findAll();
    }
}
