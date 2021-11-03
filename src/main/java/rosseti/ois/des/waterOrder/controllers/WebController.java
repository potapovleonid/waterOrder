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
        model.addAttribute("order", new Order());
        return "order";
    }

    @PostMapping("/order")
    public String createOrder(Order order){
        System.out.println(order.toString());
        return "redirect:/complete";
    }

    @GetMapping("/complete")
    public String complete(){
        return "complete";
    }

//    TODO ADD sendmail message

}
