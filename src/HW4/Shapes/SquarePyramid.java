package HW4.Shapes;

import HW4.Vertices.Vertex;

import java.util.Arrays;

public class SquarePyramid extends SpaceShape {
    double baseWidth;
    double height;

    public SquarePyramid(Vertex baseCenter, double baseWidth, double height) {
        super(Arrays.asList(baseCenter));
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        double side = Math.sqrt(baseWidth * baseWidth / 2);
        double baseArea = baseWidth * baseWidth;
        double sideArea = 4 * 0.5 * side * height;
        return baseArea + sideArea;
    }

    @Override
    public double getVolume() {
        return (baseWidth * baseWidth * height) / 3.0;
    }

    @Override
    String getShapeType() {
        return "Квадратна піраміда";
    }
}

