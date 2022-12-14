package com.practice.HW1joe.Controller;

import com.practice.HW1joe.Model.Meal;
import com.practice.HW1joe.Model.Order;
import com.practice.HW1joe.Service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/meal")
public class MealController {
    @Autowired
    MealService userService;

    @GetMapping
    public String getUserByName(@RequestParam String name, Model model){
        Meal meal = this.userService.getMealByName(name);
        model.addAttribute("user",meal);
        return "Meal";
    }

}
