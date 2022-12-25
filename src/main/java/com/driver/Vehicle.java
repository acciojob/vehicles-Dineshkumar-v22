package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed=0;
        this.currentDirection=0;
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        this.currentDirection=direction+currentDirection;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
         this.currentSpeed=speed;
         this.currentDirection=direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
        this.currentSpeed=0;
        System.out.println("stop method called - The vehicle is stopped");
    }
public int getCurrentSpeed()
    {
        return currentSpeed;
    }
    public int currentDirection()
    {
        return currentDirection;
    }
    public String name()
    {
        return name;
    }
}
