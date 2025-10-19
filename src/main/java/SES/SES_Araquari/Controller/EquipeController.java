package SES.SES_Araquari.Controller;

import SES.SES_Araquari.Entity.Equipe;
import SES.SES_Araquari.Repository.EquipeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipe") // Base URL: /equipe
public class EquipeController {

    private final EquipeRepository equipeRepository;

    public EquipeController(EquipeRepository equipeRepository) {
        this.equipeRepository = equipeRepository;
    }

    /// Create
    @PostMapping
    public Equipe criarEquipe(@RequestBody Equipe equipe){
        equipe.setIdEquipe(null);
        equipeRepository.save(equipe);
        return equipe;
    }
    @PutMapping("/atualizaequipe")
    public Equipe atualizaEquipe(@PathVariable Long id,@RequestBody Equipe equipe){
        return equipeRepository.findById(id).map(existing -> {
            existing.setNome(equipe.getNome());
            existing.setAnoFundacao(equipe.getAnoFundacao());
            existing.setStatus(equipe.isStatus());
            existing.setEsporte(equipe.getEsporte());
            return equipeRepository.save(existing);
        }).orElse(null);
    }

    // 1. Buscar todas as equipes (GET /equipe)
    @GetMapping // Mapeia para GET /equipe
    public List<Equipe> findAll(){
        return equipeRepository.findAll();
    }

    // 2. Buscar por nome da equipe (GET /equipe/buscar?nome=...)
    // Mapeia para GET /equipe/buscar, diferenciado pelo subcaminho.
    // O parâmetro 'nome' é obrigatório.
    @GetMapping("/buscar")
    public List<Equipe> findByNome(@RequestParam String nome) {
        return equipeRepository.findByNome(nome);
    }

    /// deleta equipe pela id
    @DeleteMapping("/deletarequipe")
    public void deleteEquipe(@RequestParam Long id){
        equipeRepository.deleteById(id);
    }


    }