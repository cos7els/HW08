package Shapes;

import java.util.Objects;

public abstract class Shape {
    private String color;

    abstract void draw();

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return color.equals(shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

}
