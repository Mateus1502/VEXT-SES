package SES.SES_Araquari.Controller;

import SES.SES_Araquari.Entity.Atleta;
import SES.SES_Araquari.Repository.AtletaRepository;
import SES.SES_Araquari.Repository.EquipeRepository;
import SES.SES_Araquari.Repository.EsporteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Period;

@Controller
@RequestMapping("/atletas-view")
public class AtletaViewController {

    private final AtletaRepository atletaRepository;
    private final EquipeRepository equipeRepository;
    private final EsporteRepository esporteRepository;

    public AtletaViewController(AtletaRepository atletaRepository,
                                EquipeRepository equipeRepository,
                                EsporteRepository esporteRepository) {
        this.atletaRepository = atletaRepository;
        this.equipeRepository = equipeRepository;
        this.esporteRepository = esporteRepository;
    }

    @GetMapping
    public String listarAtletas(Model model) {
        model.addAttribute("atletas", atletaRepository.findAll());
        return "atleta/lista";
    }

    @GetMapping("/novo")
    public String novoAtleta(Model model) {
        model.addAttribute("atleta", new Atleta());
        model.addAttribute("equipes", equipeRepository.findAll());
        model.addAttribute("esportes", esporteRepository.findAll());
        return "atleta/form";
    }

    @PostMapping("/salvar")
    public String salvarAtleta(@ModelAttribute Atleta atleta) {

        // Calcula idade automaticamente
        if (atleta.getDataNascimento() != null) {
            atleta.setIdade(
                    Period.between(atleta.getDataNascimento(), LocalDate.now()).getYears()
            );
        }

        atleta.setDataCadastro(LocalDate.now());
        atleta.setStatus(true);

        atletaRepository.save(atleta);

        return "redirect:/atletas-view";
    }

    @GetMapping("/editar/{idAtleta}")
    public String editar(@PathVariable Long idAtleta, Model model) {
        model.addAttribute("atleta", atletaRepository.findById(idAtleta).orElse(null));
        model.addAttribute("equipes", equipeRepository.findAll());
        model.addAttribute("esportes", esporteRepository.findAll());
        return "atleta/form";
    }

    @GetMapping("/excluir/{idAtleta}")
    public String excluir(@PathVariable Long idAtleta) {
        atletaRepository.deleteById(idAtleta);
        return "redirect:/atletas-view";
    }
}
