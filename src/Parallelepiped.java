import java.util.InputMismatchException;

public class Parallelepiped {
    private double length;
    private double width;
    private double height;

    public Parallelepiped() {
    }

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws Filter {
        if (length < 0) {
            throw new Filter("negative numbers are not allowed!! ");
        } else {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws Filter {
        if (width <= 0) {
            throw new Filter("negative numbers are not allowed!! ");
        } else {
            this.width = width;
        }

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws Filter {
        if (height <= 0) {
            throw new Filter("negative numbers are not allowed!! ");
        } else {
            this.height = height;
        }
    }


    @Override
    public String toString() {
        return "Parallelepiped{" +
                "Length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    void area() {
        System.out.println(2 * ((height * length) + (length * width) + (height * width)));
    }

    void volume() {
        System.out.println((length * width * height));
    }
}
