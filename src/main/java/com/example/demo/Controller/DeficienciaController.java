package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeficienciaController {
 
    @GetMapping("/deficiencia")
    public String index(){
        return "deficiencia/listar";
    }
}