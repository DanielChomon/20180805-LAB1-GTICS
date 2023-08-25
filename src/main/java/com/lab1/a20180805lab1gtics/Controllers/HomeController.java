package com.lab1.a20180805lab1gtics.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/principal")
public class HomeController {

    @RequestMapping(value= "", method = RequestMethod.GET)
    public String paginaPrincipal() {
        return "inicio";
    }

    @RequestMapping(value= {"/PUCP"} )

    public String paginaSecundaria() {
        return "inicio2";
    }

}
