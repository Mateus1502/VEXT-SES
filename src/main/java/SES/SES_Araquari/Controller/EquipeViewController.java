package SES.SES_Araquari.Controller;

import SES.SES_Araquari.Entity.Equipe;
import SES.SES_Araquari.Repository.EquipeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/equipes")
public class EquipeViewController {

    private final EquipeRepository equipeRepository;

    public EquipeViewController(EquipeRepository equipeRepository) {
        this.equipeRepository = equipeRepository;
    }

    // Página principal
    @GetMapping
    public String listarEquipes(Model model) {
        model.addAttribute("equipes", equipeRepository.findAll());
        model.addAttribute("equipe", new Equipe());
        return "equipe/lista";
    }

    // Salvar equipe
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Equipe equipe) {
        if (equipe.getIdEquipe() == null) {
            equipe.setIdEquipe(null);
        }
        equipeRepository.save(equipe);
        return "redirect:/equipes";
    }

    // Editar equipe
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Equipe equipe = equipeRepository.findById(id).orElse(null);
        model.addAttribute("equipe", equipe);
        model.addAttribute("equipes", equipeRepository.findAll());
        return "equipe/lista"; // Mesma tela, mas com os campos preenchidos
    }

    // Excluir equipe
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        equipeRepository.deleteById(id);
        return "redirect:/equipes";
    }
}
