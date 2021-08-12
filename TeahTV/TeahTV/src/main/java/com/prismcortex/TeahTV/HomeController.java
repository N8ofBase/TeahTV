package com.prismcortex.TeahTV;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("teahtv")
    public String homePage (Model model) {
        model.addAttribute("title", "Teah-TV");
        return "teahtv";
    }

}
