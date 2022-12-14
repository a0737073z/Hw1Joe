package com.practice.HW1joe.Service;

import com.practice.HW1joe.Model.Meal;
import com.practice.HW1joe.Model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MealService {

    List<Meal> menuList;
    List<Order> orderList;
    public MealService(){
        this.menuList = new ArrayList<>();
        this.menuList.add(new Meal("hamburger",100,"This is delicious"));
        this.menuList.add(new Meal("hamburger2",200,"This is very delicious"));
        this.menuList.add(new Meal("hamburger3",300,"This is very very delicious"));
        this.orderList = new ArrayList<>();
        this.orderList.add(new Order(1,2000,"Joe",menuList));
        this.orderList.add(new Order(2,4000,"Joe",menuList));
        this.orderList.add(new Order(3,6000,"Joe",menuList));
    }
    public Meal getMealByName(String name) {
        for(int i=0;i<this.menuList.size();i++){
            if(this.menuList.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                return this.menuList.get(i);
            }
        }
        return null;
    }

    public Order getUserByOrder(int seq) {
        for(int i=0;i<this.orderList.size();i++){
                if(this.orderList.get(i).getSeq()==seq){
                    return this.orderList.get(i);
                }
            }
        return null;
    }

    public int getTotal(){
        int total = 0;
        for(int i=0;i<this.orderList.size();i++){
            total += orderList.get(i).getTotalPrice();
            }
        return total;
    }
    public List<Order> getOrderList(){
            return this.orderList;
    }
}
