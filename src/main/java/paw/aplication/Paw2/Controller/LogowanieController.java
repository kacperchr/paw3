package paw.aplication.Paw2.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import paw.aplication.Paw2.Entity.User;
import paw.aplication.Paw2.Repository.UserRepository;
import paw.aplication.Paw2.Repository.OfertaRepository;
import paw.aplication.Paw2.form.LoginForm;


@Controller
@RequestMapping(path="/demo")

public class LogowanieController {

    @Autowired
    private OfertaRepository ofertaRepository;


    @GetMapping(path="/logowanie")
    public String modelView(Model model) {
        model.addAttribute("data",ofertaRepository.findAll());


        return "logowanie";
    }

    @PostMapping(path="/logowanie")
    public String check(LoginForm user){
        String username = user.getName();
        String password = user.getPassword();

        //if("admin".equals(username)&& "admin".equals(password)){
        if(1==1){
            return"redirect:/oferta";
        }else {


            return "logowanie";
        }
    }

}
