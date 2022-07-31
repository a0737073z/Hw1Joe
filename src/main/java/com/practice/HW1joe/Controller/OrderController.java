package com.practice.HW1joe.Controller;

import com.practice.HW1joe.Model.Order;
import com.practice.HW1joe.Service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    MealService userService;

    @GetMapping("/{seq}")
    public String getUserById(@PathVariable int seq, Model model){
        Order order = this.userService.getUserByOrder(seq);
        model.addAttribute("order",order);
        return "Order";
    }
}
