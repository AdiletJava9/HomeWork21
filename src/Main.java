import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1->AREA PARALLELEPIPED\n" +
                "2->VOLUME PARALLELEPIPED\n" +
                "3->AREA CYLINDER\n" +
                "4->VOLUME CYLINDER");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Parallelepiped parallelepiped = new Parallelepiped();
        Cylinder cylinder = new Cylinder();
        while (true) {
            switch (scanner1.nextInt()) {
                case 1:
                    try {
                        parallelepiped.setLength(scanner.nextInt());
                        parallelepiped.setWidth(scanner.nextInt());
                        parallelepiped.setHeight(scanner.nextInt());
                        parallelepiped.area();
                    } catch (Filter filter) {
                        System.out.println(filter.getMessage());
                    } catch (InputMismatchException inputMismatchException) {
                        System.out.println("Only Numbers");
                    }
                    break;
                case 2:
                    try {
                        parallelepiped.setLength(scanner.nextInt());
                        parallelepiped.setWidth(scanner.nextInt());
                        parallelepiped.setHeight(scanner.nextInt());
                        parallelepiped.volume();
                    } catch (Filter filter) {
                        System.out.println(filter.getMessage());
                    } catch (InputMismatchException inputMismatchException) {
                        System.out.println("Only Numbers");
                    }
                    break;
                case 3:
                    try {
                        cylinder.setHeight(scanner1.nextInt());
                        cylinder.setRadius(scanner1.nextInt());
                        cylinder.area();
                    } catch (Filter filter) {
                        System.out.println(filter.getMessage());
                    } catch (InputMismatchException inputMismatchException) {
                        System.out.println("Only Numbers");
                    }
                    break;
                case 4:
                    try {
                        cylinder.setHeight(scanner1.nextInt());
                        cylinder.setRadius(scanner1.nextInt());
                        cylinder.volume();
                    } catch (Filter filter) {
                        System.out.println(filter.getMessage());
                    } catch (InputMismatchException inputMismatchException) {
                        System.out.println("Only Numbers");
                    }
                default:
                    System.out.println("Only 1,2 ,3,4");
            }
        }
    }
}