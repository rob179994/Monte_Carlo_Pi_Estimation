package com.montecarlopiestimation;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class SimulationManager {
    static int iterationNo = 0;

    static int inSquare = 0;
    static int inCircle = 0;
    static int notInSquareOrCircle = 0;

    static List<Double> xSquareCoordRange;
    static List<Double> ySquareCoordRange;

    static double radiusOfCircle;
    static double xCircleCentreCoord;
    static double yCircleCentreCoord;

    static BiPredicate<Double,Double> pointInCirclePredicate;

    public static void calculateSquareCoordRange(double xRegionLength){
        xSquareCoordRange = Arrays.asList(0d,xRegionLength/2d);
        ySquareCoordRange = Arrays.asList(0d,xRegionLength/2d);
    }

    public static void calculateCircleCentreCoords(double xRegionLength){
        radiusOfCircle = xRegionLength/4d;
        xCircleCentreCoord = (xRegionLength/2d) + radiusOfCircle;
        yCircleCentreCoord = 0d;
    }

    public static void createCirclePredicates(){
        // return true if inside circle
        pointInCirclePredicate = (xCoord, yCoord) ->
                (Math.pow(xCoord-xCircleCentreCoord,2) + Math.pow(yCoord-yCircleCentreCoord,2))<=Math.pow(radiusOfCircle,2);
    }

    public static void placePoint(){

    }
}
