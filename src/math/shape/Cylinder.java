package math.shape;

import math.utils.MathConstants;

public class Cylinder implements Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return MathConstants.PI * Math.pow(radius, MathConstants.CYLINDER_VOLUME_RADIUS_POWER) * height;
    }
}
