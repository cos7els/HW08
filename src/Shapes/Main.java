package Shapes;

public class Main {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Red", 5, 4);
        Shape circle = new Circle("Blue", 4);
        rectangle.draw();
        circle.draw();
        System.out.println(rectangle.equals(circle));
        Shape eq = rectangle;
        System.out.println(rectangle.equals(eq));
        eq = circle;
        System.out.println(circle.equals(eq));

    }

}
