interface ShapeInterface {
    double area();
    double perimeter();
}
class Circle implements ShapeInterface {
    private double radius;
    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing area method
    public double area() {
        return Math.PI * radius * radius;
    }

    // Implementing perimeter method
    public double perimeter() {
        return 2 * Math.PI * radius;
    }


}
class Rectangle implements ShapeInterface {
    private double length; private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    // Inner class to calculate the diagonal of the rectangle
    class Diagonal {
        public double calculateDiagonal() {
            return Math.sqrt(length * length + width * width);
        }
    }
}
public class Shape {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(6.0, 8.0);

        // Displaying Circle area and perimeter
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        // Displaying Rectangle area and perimeter
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        // Creating an inner class object to calculate the diagonal of the Rectangle
        Rectangle.Diagonal diagonal = rectangle.new Diagonal();
        System.out.println("Rectangle Diagonal: " + diagonal.calculateDiagonal());
    }
}

