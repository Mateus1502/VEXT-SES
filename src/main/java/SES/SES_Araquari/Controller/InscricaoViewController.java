package SES.SES_Araquari.Controller;

import SES.SES_Araquari.Repository.InscricaoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view/competicoes")
public class InscricaoViewController {

    private final InscricaoRepository inscricaoRepository;

    public InscricaoViewController(InscricaoRepository inscricaoRepository) {
        this.inscricaoRepository = inscricaoRepository;
    }

    // Página de cadastro da inscrição
    @GetMapping("/cadastro")
    public String mostrarCadastroInscricao() {
        return "competicoes/cadastroInscricao";
        // /templates/competicoes/cadastroInscricao.html
    }

    // Página de listagem de inscrições
    @GetMapping("/listar")
    public String listarInscricoes(Model model) {
        model.addAttribute("inscricoes", inscricaoRepository.findAll());
        return "competicoes/listarInscricoes";
        // /templates/competicoes/listarInscricoes.html
    }
}
