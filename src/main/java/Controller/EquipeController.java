package Controller;


import Entity.Equipe;
import Repoistory.EquipeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipe")
public class EquipeController {
    /// Garante integridade de dados
    private final EquipeRepository equipeRepository;

    public EquipeController(EquipeRepository equipeRepository) {
        this.equipeRepository = equipeRepository;
    }

    /// Criação dos endpoints necessários

    /// Create
    @PostMapping
    public Equipe criarEquipe(@RequestBody Equipe equipe){
        equipeRepository.save(equipe);
        return equipe;
    }

    /// Buscar todas as equipes
    @GetMapping
    public List<Equipe> findAll(){
        return equipeRepository.findAll();
    }

    /// Buscar por nome da equipe
    @GetMapping
    public List<Equipe> findByNome(@RequestParam String nome) {
        return equipeRepository.findByNome(nome);
    }

}
