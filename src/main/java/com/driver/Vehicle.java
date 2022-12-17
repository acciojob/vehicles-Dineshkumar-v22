package com.driver;

public class Vehicle {

    private String name;
     int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        currentSpeed=0;
        currentDirection=0;
        move(10,5);
        steer(7);
        currentSpeed=0;
        stop();
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection

        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){

        System.out.println("stop method called - The vehicle is stopped");
    }

}
