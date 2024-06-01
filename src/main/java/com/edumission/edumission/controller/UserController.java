package com.edumission.edumission.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.edumission.edumission.entity.EseaForm;
import com.edumission.edumission.repository.EseaFormRepository;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private EseaFormRepository repo;

    @GetMapping("/")
    public String homepage(){
        return "index";
    }

    @GetMapping("/about")
    public String aboutpage(){
        return "about";
    }

    @GetMapping("/admission")
    public String coursespage(){
        return "admission";
    }

    @GetMapping("/career")
    public String career(){
        return "career";
    }

    @GetMapping("/training")
    public String training(){
        return "training";
    }

    @GetMapping("/services")
    public String servicespage(){
        return "services";
    }

    @GetMapping("/communityservices")
    public String communityservices(){
        return "communityservices";
    }

    @GetMapping("/contact")
    public String contactpage(){
        return "contact";
    }

    @PostMapping("/register")
    public String registerEseaForm(@ModelAttribute EseaForm esea, HttpSession session){
        System.out.println(esea);
        repo.save(esea);
        session.setAttribute("message","Your registration successful");
        return "redirect:/project";
    } 


    @GetMapping("/project")
    public String projectpage(){
        return "form";
    }


    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
