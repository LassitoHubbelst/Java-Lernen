package Einname;

import Einname.Bicycle;
import Einname.MountainBike;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(30, 0, 8);
        MountainBike mountainBike = new MountainBike(0, 20, 0, 10);

        bicycle.speedUp(5);
        mountainBike.setHeight(15);
        bicycle.printStates();
        mountainBike.printStates();

        if (bicycle.speed > mountainBike.speed) {
            System.err.println("MountainBike is faster");
        }
        else {
            System.err.println("Bicycle is faster");
            System.err.println("MountainBike speed: " + mountainBike.speed  );
        }
    }
}