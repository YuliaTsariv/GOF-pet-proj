package com.example.demo.GOF.factory.valid;

import com.example.demo.GOF.factory.іnvalid.Dish;
import com.example.demo.GOF.factory.іnvalid.DishType;

public class Caffe2 {
    private final DishFactory dishFactory;

    public Caffe2(DishFactory dishFactory) {
        this.dishFactory = dishFactory;
    }

    public Dish orderDish(DishType type) {
        return dishFactory.makeDish(type);
    }
}
