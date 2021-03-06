package paw.aplication.Paw2.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import paw.aplication.Paw2.Entity.Oferta;
import paw.aplication.Paw2.Repository.OfertaRepository;




@Controller
@RequestMapping(path="/demo")

public class KontaktController {

    @Autowired
    private OfertaRepository ofertaRepository;


    @GetMapping(path="/kontakt")
    public String modelView(Model model) {
        model.addAttribute("data",ofertaRepository.findAll());


        return "kontakt";
    }

}
