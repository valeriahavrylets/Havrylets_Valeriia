package HW4.Shapes;

import HW4.Vertices.Vertex;

import java.util.Arrays;
import java.util.Collections;

public class Cuboid extends SpaceShape {
    double width;
    double height;
    double depth;

    public Cuboid(Vertex bottomFrontLeftCorner, double width, double height, double depth) {
        super(Collections.singletonList(bottomFrontLeftCorner));
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String getShapeType() {
        return "Кубоїд";
    }
}