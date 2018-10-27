package paw.aplication.Paw2.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import paw.aplication.Paw2.Entity.Zamowienia;
import paw.aplication.Paw2.Repository.ZamowieniaRepository;




@Controller
@RequestMapping(path="/demo")

public class ZamowieniaController {

    //@Autowired
    //private ZamowieniaRepository zamowieniaRepository;


    @GetMapping(path="/zamowienia")
    public String modelView(Model model) {
        //model.addAttribute("data",ofertaRepository.findAll());
        model.addAttribute("zamowienia", new Zamowienia());

        return "zamowienia";
    }
    @PostMapping(path="/zamowienia")
    public String check(@ModelAttribute("zamowienia") Zamowienia zamowienia){
        
        return "zamowienia";
    }

}
