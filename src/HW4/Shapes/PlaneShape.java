package HW4.Shapes;

import HW4.Interface.AreaMeasurable;
import HW4.Interface.PerimeterMeasurable;
import HW4.Vertices.Vertex;

import java.util.List;

// базовий клас для всіх двовимірних форм, містить список двовимірних вершин

abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    public PlaneShape(List<Vertex> vertices) {
        super(vertices);
    }
}
