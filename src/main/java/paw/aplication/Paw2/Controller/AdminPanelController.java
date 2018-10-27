package paw.aplication.Paw2.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import paw.aplication.Paw2.Entity.Oferta;
import paw.aplication.Paw2.Entity.User;
import paw.aplication.Paw2.Entity.Zamowienia;
import paw.aplication.Paw2.Repository.OfertaRepository;
import paw.aplication.Paw2.Repository.UserRepository;
import paw.aplication.Paw2.Repository.ZamowieniaRepository;
import paw.aplication.Paw2.form.LoginForm;
import paw.aplication.Paw2.Controller.LogowanieController;
import paw.aplication.Paw2.form.Role;




@Controller
@RequestMapping(path="/demo")

public class AdminPanelController {

    //LogowanieController lc = new LogowanieController();
    Role role = new Role();
    @Autowired
    private ZamowieniaRepository zamowieniaRepository;
    //@Autowired
    //private OfertaRepository ofertaRepository;

    @GetMapping(path="/adminPanel")
    public String showAdminPanel(Model model){
        model.addAttribute("data",zamowieniaRepository.findAll());
        model.addAttribute("delet", new Zamowienia());
        //model2.addAttribute("data2",ofertaRepository.findAll());

        int adminrole=role.getAdmin();
        if(adminrole==1){
            return "adminPanel";
        }else{
            return "redirect:/demo/index";
        }

    }
    @DeleteMapping
    public String deleteById(@ModelAttribute("delet") Integer id){
        zamowieniaRepository.deleteById(id);
        return"adminPanel";
    }

    /* public String check(@ModelAttribute("user") LoginForm user){
        String username = user.getLogin();
        String password = user.getPassword();

        User user2 = userRepository.findUserByName(username);
        if(user2!=null) {
            String dbusername = user2.getName();
            String dbpassword = user2.getPassword();

            if ( user2.getRole()==1) {

                return "adminPanel";

            }


            else {
                return "userPanel";
            }
        }else{
            return "logowanie";
        }
    }*/

}
