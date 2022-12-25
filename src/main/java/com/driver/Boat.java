package com.driver;

class Boat implements WaterVehicle
{
String name;
int capacity;

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
