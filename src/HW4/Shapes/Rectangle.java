package HW4.Shapes;

import HW4.Interface.AreaMeasurable;
import HW4.Interface.PerimeterMeasurable;
import HW4.Interface.VolumeMeasurable;
import HW4.Vertices.Vertex;

import java.util.Arrays;


public class Rectangle extends PlaneShape {
    double width;
    double height;

    public Rectangle(Vertex topLeftCorner, double width, double height) {
        super(Arrays.asList(topLeftCorner));
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public  double getVolume() {
        return 0;
    }

    @Override
    public  String getShapeType() {
        return "Прямокутник";
    }
}
