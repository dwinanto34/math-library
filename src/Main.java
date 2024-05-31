import math.shape.Bar;
import math.shape.Cube;
import math.shape.Cylinder;
import math.utils.VolumeCalculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Expects "Cube Volume: 27"
        Cube cube = new Cube(3);
        System.out.println("Cube Volume: " + VolumeCalculator.calculateVolume(cube));

        // Expects "Bar Volume: 60"
        Bar bar = new Bar(3, 4, 5);
        System.out.println("Bar Volume: " + VolumeCalculator.calculateVolume(bar));

        // Expects "Cylinder Volume: 3140"
        Cylinder cylinder = new Cylinder(10, 10);
        System.out.println("Cylinder Volume: " + VolumeCalculator.calculateVolume(cylinder));
    }
}