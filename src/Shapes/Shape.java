package Shapes;

public abstract class Shape {
    private String color;

    abstract void draw();

    public Shape(String color) {
        this.color = color;
    }
}
