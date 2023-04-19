package sn.esp.project1springsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class TestController {

    @GetMapping("/protected")
    public String helloSecure()
    {
        return "Hello secure !!!";
    }

    @GetMapping("/public")
    public String helloPublic()
    {
        return "Hello public !!!";
    }

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello !!!";
    }

    @GetMapping("/user")
    public String loginUser()
    {
        return "L'utilisateur s'est connecté avec succès !!!";
    }

    @GetMapping("/admin")
    public String loginAdmin()
    {
        return "L'administrateur s'est connecté avec succès !!!";
    }
}
