package Shapes;

import java.util.Objects;

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        String[][] picture = new String[height][width];
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length; j++) {
                if (i == 0 || i == picture.length - 1) {
                    System.out.print("x ");
                } else if (j == 0 || j == picture[i].length - 1) {
                    System.out.print("x ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return height == rectangle.height && width == rectangle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, width);
    }

}
