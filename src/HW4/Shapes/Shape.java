package HW4.Shapes;

import HW4.Vertices.Vertex;

import java.util.List;

abstract class Shape {      // Клас форми, базовий клас для будь-якої форми, містить список вершин
    abstract double getPerimeter();

    abstract double getArea();

    abstract double getVolume();

    abstract String getShapeType();
    List<Vertex> vertices;

    public Shape(List<Vertex> vertices) {
        this.vertices = vertices;
    }

/*    @Override
    public String toString() {
        return "Shape{" +
                "vertices=" + vertices +
                '}';
    }*/
     @Override
    public String toString() {
        return "Shape type: " + getShapeType() + "\nVertices: " + vertices + "\nPerimeter: " + getPerimeter()
                + "\nArea: " + getArea() + "\nVolume: " + getVolume() + "\n";
    }
}
