package SES.SES_Araquari.Controller;


import SES.SES_Araquari.Entity.Inscricao;
import SES.SES_Araquari.Repository.InscricaoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/competicoes")
public class InscricaoController {
    private final  InscricaoRepository inscricaoRepository;

    public InscricaoController(InscricaoRepository inscricaoRepository) {
        this.inscricaoRepository = inscricaoRepository;
    }

    /// Cria uma inscrição
    @PostMapping
    public Inscricao save(@RequestBody Inscricao inscricao){
        return inscricaoRepository.save(inscricao);
    }

    /// Mostra todas as inscrições
    @GetMapping
    public List<Inscricao> findAll() {
        return inscricaoRepository.findAll();
    }
}
