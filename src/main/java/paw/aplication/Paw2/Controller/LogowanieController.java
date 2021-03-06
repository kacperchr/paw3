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
import paw.aplication.Paw2.form.Role;

@Controller
@RequestMapping(path="/demo")

public class LogowanieController {
    //private int role = 0;



    @Autowired
    private UserRepository userRepository;
    private Role role = new Role();


    @GetMapping(path="/logowanie")
    public String modelView(Model model) {
        model.addAttribute("user",new LoginForm());


        return "logowanie";
    }

    @PostMapping(path="/logowanie")
    public String check(@ModelAttribute("user") LoginForm user){
        String username = user.getLogin();
        String password = user.getPassword();

        User user2 = userRepository.findUserByName(username);
        if(user2!=null) {
            String dbusername = user2.getName();
            String dbpassword = user2.getPassword();

            if (dbusername.equals(username) && dbpassword.equals(password) && user2.getRole()==1) {

                //user.setRole(1);
                role.setAdmin(1);
                return "redirect:/demo/adminPanel";

            }


            else {
                role.setAdmin(2);
                //user.setRole(2);
                return "redirect:/demo/userPanel";
            }
        }else{
            return "logowanie";
        }

    }


}
