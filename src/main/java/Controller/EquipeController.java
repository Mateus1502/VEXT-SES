package Controller;


import Entity.Equipe;
import Repoistory.EquipeRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/equipe")
public class EquipeController {
    /// Garante integridade de dados
    private final EquipeRepository equipeRepository;

    public EquipeController(EquipeRepository equipeRepository) {
        this.equipeRepository = equipeRepository;
    }

    /// Criação dos endpoints necessários

    @PostMapping
    public Equipe criarEquipe(@RequestBody Equipe equipe){
        equipeRepository.save(equipe);
        return equipe;
    }

}
