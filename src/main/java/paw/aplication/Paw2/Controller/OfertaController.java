package paw.aplication.Paw2.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import paw.aplication.Paw2.Entity.Oferta;
import paw.aplication.Paw2.Repository.OfertaRepository;

import java.util.List;


@Controller
@RequestMapping(path="/demo")

public class OfertaController {
    @Autowired
    private OfertaRepository ofertaRepository;


    @GetMapping(path="/oferta")
    public String modelView(Model model) {

        Oferta oferta = new Oferta();
        model.addAttribute("products", ofertaRepository.listAllOferta());

        //Oferta oferta = OfertaRepository.findProductById("1");
        /*Oferta oferta = new Oferta();
        oferta = ofertaRepository.findOfertaById(1);
        model.addAttribute("number",oferta.getId());
        model.addAttribute("user", oferta.getName());
        model.addAttribute("picture", oferta.getPicture());
        model.addAttribute("text", oferta.getText());*/

        return "oferta";
    }

}
