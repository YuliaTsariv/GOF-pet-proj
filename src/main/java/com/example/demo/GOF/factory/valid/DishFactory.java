package com.example.demo.GOF.factory.valid;

import com.example.demo.GOF.factory.іnvalid.*;

public class DishFactory {
    public Dish makeDish (DishType type) {
        Dish dish = null;

        switch (type) {
            case BURGER:
                dish = new Burger();
                break;
            case PIZZA:
                dish = new Pizza();
                break;
            case SOUP:
                dish = new Soup();
                break;
        }
        return dish;
    }
}
