package com.zipcodewilmington.assessment2.part3;

public class BlueJay extends Bird{
    public BlueJay() {
    }
    @Override
    public String move() {
        return "fly";
    }

    public String color(){
        return "blue";
    }


    public int getSpeed() {
        return 13;
    }
}

