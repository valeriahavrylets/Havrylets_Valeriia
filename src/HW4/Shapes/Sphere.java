package HW4.Shapes;

import HW4.Vertices.Vertex;

import java.util.Collections;

public class Sphere extends SpaceShape {
    double radius;

    public Sphere(Vertex center, double radius) {
        super(Collections.singletonList(center));
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public String getShapeType() {
        return "Сфера";
    }
}
