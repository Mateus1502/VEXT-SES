package Controller;

/// Imports necessários para o controller

import Entity.Atleta;
import Repoistory.AtletaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atletas")
public class AtletaController {
    /// Garante integridade dos dados
    private final AtletaRepository atletaRepository;

    public AtletaController(AtletaRepository atletaRepository) {
        this.atletaRepository = atletaRepository;
    }

    /// Endpoint para criar um atleta, aqui será exposto para o front end
    @PostMapping
    public Atleta createAtleta(@RequestBody Atleta atleta){
        atletaRepository.save(atleta);
        return atleta;
    }
    /// Endpoint para visualizar todos os atletas do banco
    @GetMapping
    public List<Atleta> getAllAtletas(){
        return atletaRepository.findAll();
    }
    ///Usamos o buscar para não conflitar com o get all
    @GetMapping("/buscar")
    public List<Atleta> getAtletaByNome(@RequestParam String nome){
        return atletaRepository.findAtletaByNome(nome);
    }

    @GetMapping("/buscarcpf")
    public Atleta getAtletaByCpf(@RequestParam String cpf){
        return atletaRepository.findAtletaByCpf(cpf);
    }
}
