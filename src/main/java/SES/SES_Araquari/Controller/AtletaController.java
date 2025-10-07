package SES.SES_Araquari.Controller;

/// Imports necessários para o controller

import SES.SES_Araquari.Entity.Atleta;
import SES.SES_Araquari.Repository.AtletaRepository;
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
    /// SOMENTE CRIA ATLETA
    @PostMapping
    public Atleta createAtleta(@RequestBody Atleta atleta){
        atleta.setIdAtleta(null);
        atletaRepository.save(atleta);
        return atleta;
    }
    /// ATUALIZA ATLETA
    @PutMapping("/{id}")
    public Atleta updateAtleta(@PathVariable Long id , @RequestBody Atleta atleta){
        return atletaRepository.findById(id).map(existing -> {
            existing.setNome(atleta.getNome());
            existing.setSobrenome(atleta.getSobrenome());
            existing.setCategoria(atleta.getCategoria());
            existing.setDataNascimento(atleta.getDataNascimento());
            existing.setEquipe(atleta.getEquipe());
            existing.setEnderecoBairro(atleta.getEnderecoBairro());
            existing.setEnderecoRua(atleta.getEnderecoRua());
            existing.setEnderecoNumero(atleta.getEnderecoNumero());
            existing.setAltura(atleta.getAltura());
            existing.setPeso(atleta.getPeso());
            existing.setCpf(atleta.getCpf());
            return atletaRepository.save(existing);
        }).orElse(null);
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
