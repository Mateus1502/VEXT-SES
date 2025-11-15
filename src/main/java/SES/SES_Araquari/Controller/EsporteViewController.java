package SES.SES_Araquari.Controller;

import SES.SES_Araquari.Repository.EsporteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view/esportes")
public class EsporteViewController {

    private final EsporteRepository esporteRepository;

    public EsporteViewController(EsporteRepository esporteRepository) {
        this.esporteRepository = esporteRepository;
    }

    // Página de cadastro
    @GetMapping("/cadastro")
    public String mostrarCadastroEsporte() {
        return "esportes/cadastroEsporte"; // /templates/esportes/cadastroEsporte.html
    }

    // Página de listagem
    @GetMapping("/listar")
    public String listarEsportes(Model model) {
        model.addAttribute("esportes", esporteRepository.findAll());
        return "esportes/listarEsportes"; // /templates/esportes/listarEsportes.html
    }
}
