package com.example.springbootsecurityautorization.Ressource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRessource {

    @GetMapping("/")
    public String Home (){
        return ("<h1> Welcome in Home </h1>");
    }
    @GetMapping("/user")
    public String USER (){
        return ("<h1> Welcome in Home USER </h1>");
    }
    @GetMapping("/admin")
    public String ADMIN (){
        return ("<h1> Welcome in Home ADMIN </h1>");
    }
}
