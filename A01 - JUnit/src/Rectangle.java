public class Rectangle {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getDiagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
