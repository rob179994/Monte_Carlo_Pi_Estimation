package com.montecarlopiestimation;

public class Main {

    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("Wrong argument number");
        }
        float xLength = Float.parseFloat(args[0]);
        Coordinate.setCoordinates(xLength);
        SimulationManager.calculateSquareCoordRange();
    }
}
