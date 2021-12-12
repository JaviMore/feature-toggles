package com.nttdata.featuretoggle;
import com.nttdata.featuretoggle.database.FeatureRepository;
import com.nttdata.featuretoggle.database.FeatureToggle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    @Autowired
    FeatureRepository featureRepository;


    @GetMapping("/")
    public String index(Model model) {

        FeatureToggle featureToggle = featureRepository.getById(1L);

        if(featureToggle.isStatus()) {
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
