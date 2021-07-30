package com.Abstract;

//ANSWER FOR PROBLEM 2
abstract class Transportation{
    abstract int getTranspoFee();
}

class Plane extends Transportation{
    int fee = 1000;

    @Override
    int getTranspoFee() {
        return this.fee;
    }
}

class Car extends Transportation{
    int fee = 500;

    @Override
    int getTranspoFee() {
        return this.fee;
    }
}

class Train extends Transportation{
    int fee = 400;

    @Override
    int getTranspoFee() {
        return this.fee;
    }
}

class Bus extends Transportation{
    int fee = 300;

    @Override
    int getTranspoFee() {
        return this.fee;
    }
}


class Main {
    public static void main(String args[]){
        Plane plane = new Plane();
        Car car = new Car();
        Train train = new Train();
        Bus bus = new Bus();

        if(plane.getTranspoFee() <= 500){
            System.out.println("Xiaoming can ride a PLANE!");
        }
        if(car.getTranspoFee() <= 500){
            System.out.println("Xiaoming can ride a CAR!");
        }
        if(bus.getTranspoFee() <= 500){
            System.out.println("Xiaoming can ride a BUS!");
        }
        if(train.getTranspoFee() <= 500){
            System.out.println("Xiaoming can ride a TRAIN!");
        }

    }
}
