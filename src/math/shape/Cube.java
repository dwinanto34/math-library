package math.shape;

import math.utils.MathConstants;

public class Cube implements Shape {
    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(sideLength, MathConstants.CUBE_VOLUME_POWER);
    }
}
