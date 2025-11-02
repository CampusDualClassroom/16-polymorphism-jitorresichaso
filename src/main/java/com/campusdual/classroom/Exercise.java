package com.campusdual.classroom;

public class Exercise {

    public static void main(String[] args) {
        Plane plane = new Plane("Boeing");
        Tractor tractor = new Tractor(3500);

        plane.start();
        tractor.start();

        plane.fly();
        plane.land();

        tractor.forward();
        tractor.maintenance();
        tractor.stop();
    }
}
