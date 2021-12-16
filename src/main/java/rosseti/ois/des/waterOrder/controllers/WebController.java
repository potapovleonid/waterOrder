package rosseti.ois.des.waterOrder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import rosseti.ois.des.waterOrder.entities.Order;
import rosseti.ois.des.waterOrder.services.OrderService;

import java.util.Date;

@Controller
public class WebController {

    private final OrderService oService;

    public WebController(OrderService oService) {
        this.oService = oService;
    }

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/order")
    public String order(Model model) {
        model.addAttribute("order", new Order());
        return "order";
    }

    @PostMapping("/order")
    public String createOrder(Order order) {
        System.out.println(order.toString());
        System.out.println(order.getLogin());
        oService.save(order);
        return "redirect:/complete";
    }

    @GetMapping("/complete")
    public String complete() {
        return "complete";
    }

//    TODO ADD sendmail message

}
