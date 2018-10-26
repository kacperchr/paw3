package paw.aplication.Paw2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import paw.aplication.Paw2.Entity.User;
import paw.aplication.Paw2.Repository.UserRepository;

import javax.persistence.Id;

@Controller
@RequestMapping(path="/demo")

public class MainController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email){
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }
    /*@GetMapping(path="/index")
    public String sampleView(Model model) {
       // String name2 = userRepository.findAll();
        model.addAttribute(userRepository.findAll());
        return "index";
    }*/
    @GetMapping(path="/index")
    public String modelView(Model model) {

       /* User user = userRepository.findUserByName("gunwo");
        model.addAttribute("number",user.getId());
        model.addAttribute("user",user.getName());*/

        return "sample";
    }

}
