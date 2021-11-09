package com.company;

public class LaptopKeeper {
    private final LaptopShop Hp;
    private final LaptopShop Asus;
    public LaptopKeeper(){
        Hp = new Hp();
        Asus = new Asus();
    }

    public void HpInfo(){
        Hp.model();
        Hp.price();
    }
    public void AsusInfo(){
        Asus.model();
        Asus.price();
    }
}

