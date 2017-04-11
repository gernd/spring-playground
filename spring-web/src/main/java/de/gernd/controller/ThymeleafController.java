package de.gernd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {


    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("myTemplateText", "this is the template text");
        return "index";
    }
}
