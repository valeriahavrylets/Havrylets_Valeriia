package HW4.Vertices;

public class Vertex {  // Клас вершин, представляє точку в 2D/3D просторі
    double x;
    double y;
    double z;

    public Vertex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vertex(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
 /*   public double distance(Vertex other) {
        if (z == 0 && other.z == 0) { // 2D
            double dx = this.x  - other.x();
            double dy = this.y - other.y();
            return Math.sqrt(dx*dx + dy*dy);
        } else { // 3D
            double dx = this.x - other.x();
            double dy = this.y - other.y();
            double dz = this.z - other.z();
            return Math.sqrt(dx*dx + dy*dy + dz*dz);
        }
    }*/

    public double distance(Vertex other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        double dz = this.z - other.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    @Override
    public String toString() {
        if (z == 0) {
            return "(" + x + ", " + y + ")";
        } else {
            return "(" + x + ", " + y + ", " + z + ")";
        }
    }
}


