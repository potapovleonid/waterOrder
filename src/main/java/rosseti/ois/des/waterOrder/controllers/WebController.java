package rosseti.ois.des.waterOrder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import rosseti.ois.des.waterOrder.entities.Order;

@Controller
public class WebController {

    @GetMapping("/")
    public String welcome(){
        return "welcome";
    }

    @GetMapping("/order")
    public String order(Model model){
        model.addAttribute("orderTest", new Order());
        return "order";
    }

    @GetMapping("/complete")
    public String complete(){
        return "complete";
    }

    @PostMapping("/order")
    public String createOrder(Order order){
        System.out.println(order.toString());
        return "redirect:/complete";
    }

//    TODO ADD post mapping print order

//    TODO ADD sendmail message

}
