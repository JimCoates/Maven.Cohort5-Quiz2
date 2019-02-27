package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird{
    String migrationMonth;

    public RedRobin(){
        migrationMonth = null;
    }

    @Override
    public String color() {
        return "red";
    }

    @Override
    public int getSpeed() {
        return 10;
    }


    public String getMigrationMonth(){
        return this.migrationMonth;
    }

    public void setMigrationMonth(String input){
        this.migrationMonth = input;
    }
}
