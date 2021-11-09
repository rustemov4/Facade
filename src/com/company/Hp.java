package com.company;

public class Hp implements LaptopShop{

    @Override
    public void model() {
        System.out.println("Model Hp pavilion gaming");
    }

    @Override
    public void price() {
        System.out.println("price 340000");
    }
}
