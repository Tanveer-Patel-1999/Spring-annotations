package com.authex.redis.rest;

import com.authex.redis.service.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {


//    1 :  construction injection
//    private VegPizza vegPizza;

//    @Autowired
//    public PizzaController(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

//    2 : setter injection
//    public void setVegPizza(VegPizza vegPizza){
//        this.vegPizza = vegPizza;
//    }

//     3 : field injection

//    @Autowired
//    private VegPizza vegPizza;

// note : by using the "Interface instead of class " we can achived a loose coupling
//    here Pizza is an Interface
    private final Pizza pizza;

//vegPizza is class name : bean name same as class name start with small later
    @Autowired
    public PizzaController(@Qualifier("vegPizza") Pizza pizza) {
        this.pizza = pizza;
    }

    public String getPizza() {
        return pizza.getPizza();
    }
}
