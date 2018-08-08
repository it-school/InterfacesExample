package com.itschool;

public class Airplane implements IVehicle {
    private int speed;
    private int volume;
    private int consumption;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume > 0 ? volume : 1000;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption > 0 ? consumption : 100;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed > 0 ? speed : 200;
    }

    public Airplane() {
        speed = 300;
        volume = 900;
        consumption = 80;
    }

    @Override
    public int CalculateMaxDistance() {
        return this.volume / this.consumption;
    }

    @Override
    public String toString() {
        return "This is an airplane. It's max distance is: " + this.CalculateMaxDistance();
    }
}
