package HW4.Shapes;

import HW4.Vertices.Vertex;

import java.util.Arrays;

public class Circle extends PlaneShape {
    double radius;

    public Circle(Vertex center, double radius) {
        super(Arrays.asList(center));
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public String getShapeType() {
        return "Коло";
    }
}
