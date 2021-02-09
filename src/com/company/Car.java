package com.company;

import java.util.Random;

public class Car {
    private int IdOfCar;
    private State state = State.ON_ROAD;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Car(int idOfCar) {
        IdOfCar = idOfCar;

    }

    public void setIdOfCar(int idOfCar) {
        IdOfCar = idOfCar;
    }

    public int getIdOfCar() {
        return IdOfCar;
    }
    public State changeOnParking( ){
         return State.ON_PARKING;
    }
    public State changeOnRoad(){
        return State.ON_ROAD;
        }

    @Override
    public String toString() {
        return "Car{" +
                "IdOfCar=" + IdOfCar +
                ", state=" + state +
                '}';
    }
}


