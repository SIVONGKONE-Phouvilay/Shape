package shape;

public class circle extends Shape{
    double radius;

    public circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(this.radius,2);
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}