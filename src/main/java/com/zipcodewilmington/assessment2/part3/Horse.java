package com.zipcodewilmington.assessment2.part3;

public class Horse implements Animal{
    public Horse(){

    }

    @Override
    public String move() {
        return "gallop";
    }

    @Override
    public String color() {
        return "brown";
    }

    @Override
    public int getSpeed() {
        return 10;
    }
}
