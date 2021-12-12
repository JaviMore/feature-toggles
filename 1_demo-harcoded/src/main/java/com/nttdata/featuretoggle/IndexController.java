package com.nttdata.featuretoggle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {


    @GetMapping("/")
    public String index(Model model) {

        //Change this to active
        boolean awesomeFeature = false;

        if(awesomeFeature) {
            newAwesomeMethod(model);
        } else {
            oldMethod(model);
        }
        return "index";
    }


    private void newAwesomeMethod(Model model){
        model.addAttribute("msg", "New awesome web");
        model.addAttribute("image", "img/awesome.gif");
        model.addAttribute("css", "new-main-section");
    }

    private void oldMethod(Model model){
        model.addAttribute("msg", "boring old web");
        model.addAttribute("image", "img/boring.gif");
        model.addAttribute("css", "main-section");
    }


}
