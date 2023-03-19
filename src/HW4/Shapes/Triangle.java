package HW4.Shapes;

import HW4.Vertices.Vertex;

import java.util.Arrays;

public class Triangle extends PlaneShape {
    public Triangle(Vertex v1, Vertex v2, Vertex v3) {
        super(Arrays.asList(v1, v2, v3));
    }

    @Override
    public double getPerimeter() {
        double d1 = vertices.get(0).distance(vertices.get(1));
        double d2 = vertices.get(1).distance(vertices.get(2));
        double d3 = vertices.get(2).distance(vertices.get(0));
        return d1 + d2 + d3;
    }

    @Override
    public double getArea() {
        double a = vertices.get(0).distance(vertices.get(1));
        double b = vertices.get(1).distance(vertices.get(2));
        double c = vertices.get(2).distance(vertices.get(0));
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double getVolume() {
        return 0;
    }

    @Override
    public String getShapeType() {
        return "Трикутник";
    }
}