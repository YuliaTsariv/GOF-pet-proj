package com.example.demo.GOF.factory.іnvalid;

public class Caffe {

    public Dish orderDish(DishType type) {
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

        dish.calculateTheCost();
        dish.makeDish();

        return dish;
    }
}

