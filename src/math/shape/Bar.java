package math.shape;

public class Bar implements Shape {
    private double length;
    private double width;
    private double height;

    public Bar(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return length * width * height;
    }
}
