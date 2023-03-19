package HW4.Shapes;

import HW4.Interface.AreaMeasurable;
import HW4.Interface.VolumeMeasurable;
import HW4.Vertices.Vertex;

import java.util.List;


abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    public SpaceShape(List<Vertex> vertices) {
        super(vertices);
    }
}