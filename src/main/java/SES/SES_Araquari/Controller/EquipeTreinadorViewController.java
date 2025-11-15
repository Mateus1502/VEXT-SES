package SES.SES_Araquari.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EquipeTreinadorViewController {

    @GetMapping("/view/equipeTreinador/cadastrar")
    public String cadastrarTreinadorView() {
        return "equipeTreinador/cadastrar";
    }

    @GetMapping("/view/equipeTreinador/buscar")
    public String buscarTreinadorView() {
        return "equipeTreinador/buscar";
    }
}
