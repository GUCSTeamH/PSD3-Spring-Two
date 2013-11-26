package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CompSessionController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String sessionForm(Model model) {
        model.addAttribute("compsession", new CompSession());
        return "sessionform";
    }
    
    @RequestMapping(value="/", method=RequestMethod.POST)
    public String sessionSubmit(@ModelAttribute CompSession compsession, Model model) {
        model.addAttribute("compsession", compsession);
        return "sessionresult";
    }

}
