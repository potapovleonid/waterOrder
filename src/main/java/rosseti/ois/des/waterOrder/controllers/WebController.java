package rosseti.ois.des.waterOrder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping("/")
    public String welcome(){
        return "welcome";
    }

    @GetMapping("/order")
    public String order(){
        return "order";
    }

//    TODO ADD post mapping print order

//    TODO ADD sendmail message

}
