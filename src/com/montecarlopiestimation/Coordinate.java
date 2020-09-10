package com.montecarlopiestimation;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Coordinate {
    static float xRegionLength;
    static float yRegionLength;

    public static void setCoordinates(float xRegionLength){
        Coordinate.xRegionLength = xRegionLength;
        Coordinate.yRegionLength = xRegionLength/2;
    }

    public static List<Float> randomCoordinate(){
        return Arrays.asList(new Random().nextFloat()*xRegionLength,new Random().nextFloat()*yRegionLength);
    }
}
