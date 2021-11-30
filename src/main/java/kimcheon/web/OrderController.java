package kimcheon.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kimcheon.domain.*;

@Controller
@RequestMapping(path = "/order")
public class OrderController {
    
    @GetMapping
    public String orderPage(Model model){
        model.addAttribute("dishTypeArr", Dish.Type.values());//배열 보냄.
        return "order.html";
    }

}
