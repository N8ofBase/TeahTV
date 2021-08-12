package com.prismcortex.TeahTV;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("teahtv")
public class HomeController {

    @GetMapping("")
    public String homePage (Model model) {
        model.addAttribute()
        return "teahtv";
    }

}
