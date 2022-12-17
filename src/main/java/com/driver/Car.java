package com.driver;

public class Car extends Vehicle {
    private int wheels=4;
    private String type="leftt";
    private int doors=4;
    private int gears=5;
    private boolean isManual=true;
    private int currentGear=1;
    private int seats=6;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        changeGear(2);
        changeSpeed(7,8);

    }

    public void changeGear(int newGear){

        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
