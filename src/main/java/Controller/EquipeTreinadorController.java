package Controller;

import Entity.EquipeTreinador;
import Repoistory.EquipeTreinadorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipeTreinador")
public class EquipeTreinadorController {
    private final EquipeTreinadorRepository equipeTreinadorRepository;

    public EquipeTreinadorController(EquipeTreinadorRepository equipeTreinadorRepository) {
        this.equipeTreinadorRepository = equipeTreinadorRepository;
    }
    /// Criação dos endpoints

    /// Cadastro de um treinador
    @PostMapping
    public EquipeTreinador cadastrarTreinador(@RequestBody EquipeTreinador equipeTreinador) {
        equipeTreinadorRepository.save(equipeTreinador);
        return equipeTreinador;
    }

    /// Busca por cpf
    @GetMapping
    public EquipeTreinador findCPF(@RequestParam String cpf) {
        return equipeTreinadorRepository.findEquipeTreinadorByCpf(cpf);
    }
}
