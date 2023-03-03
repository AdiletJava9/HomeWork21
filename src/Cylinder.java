import static java.lang.Math.PI;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws Filter {
        if (radius <= 0) {
            throw new Filter("negative numbers are not allowed!! ");
        }
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws Filter {
        if (height <= 0) {
            throw new Filter("negative numbers are not allowed!! ");
        }
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }

    void area() {
        System.out.println(2 * PI * radius * (height + radius));
    }

    void volume() {
        System.out.println((PI * radius * radius * height));
    }
}
