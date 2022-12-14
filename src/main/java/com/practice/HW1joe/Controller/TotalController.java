package com.practice.HW1joe.Controller;

import com.practice.HW1joe.Model.Meal;
import com.practice.HW1joe.Model.Order;
import com.practice.HW1joe.Service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping(value = "/total")
public class TotalController {

    @Autowired
    MealService userService;

    @GetMapping("total")
    public String getUserById(Model model){
        int total = this.userService.getTotal();
        model.addAttribute("total",total);
        return "Total";
    }
}
