package HW4;

import HW4.Interface.AreaMeasurable;
import HW4.Interface.PerimeterMeasurable;
import HW4.Interface.VolumeMeasurable;
import HW4.Shapes.*;
import HW4.Shapes.Rectangle;
import HW4.Vertices.Vertex;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class HW4 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

            Triangle triangle = new Triangle(new Vertex(1, 2), new Vertex(1, 0), new Vertex(-1, -1));
            Rectangle rectangle = new Rectangle(new Vertex(0, 0), 8.0, 4.0);
            Circle circle = new Circle(new Vertex(1, 1), 15.0);
            SquarePyramid squarePyramid = new SquarePyramid(new Vertex(2, 3), 10.0, 20.0);
            Cuboid cuboid = new Cuboid(new Vertex(1, 2), 25.0, 10.0, 7.0);
            Sphere sphere = new Sphere(new Vertex(0, 0), 15.0);

            System.out.println(triangle);
            System.out.println("---------------");
            System.out.println(rectangle);
            System.out.println("---------------");
            System.out.println(circle);
            System.out.println("---------------");
            System.out.println(squarePyramid);
            System.out.println("---------------");
            System.out.println(cuboid);
            System.out.println("---------------");
            System.out.println(sphere);

        for (Shape shape : shapes) {
           // System.out.println("Shape type: " + shape.getShapeType());
           // System.out.println("Vertices: " + shape.getVertices());
            if (shape instanceof PerimeterMeasurable) {
                System.out.println("Perimeter: " + ((PerimeterMeasurable) shape).getPerimeter());
            }
            if (shape instanceof AreaMeasurable) {
                System.out.println("Area: " + ((AreaMeasurable) shape).getArea());
            }
            if (shape instanceof VolumeMeasurable) {
                System.out.println("Volume: " + ((VolumeMeasurable) shape).getVolume());
            }
            System.out.println();
        }

        }
    }

