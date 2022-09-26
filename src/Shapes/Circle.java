package Shapes;

import java.util.Objects;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    void draw() {
        String[][] picture = new String[this.radius * 2][this.radius * 2];
        int radius = this.radius % 2 == 0 ? this.radius : this.radius + 1;
        int counter = radius;
        int delta = (picture.length - radius);
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length; j++) {
                if (i == 0 || i == picture.length - 1) {
                    if (j >= delta / 2 && j < picture.length - delta / 2) {
                        System.out.print("X  ");
                    } else {
                        System.out.print("   ");
                    }
                } else if (i >= delta / 2 && i < picture.length - delta / 2) {
                    if (j == 0 || j == picture[i].length - 1) {
                        System.out.print("X  ");
                    } else {
                        System.out.print("   ");
                    }
                } else if (j == (picture.length / 2 - 1) - counter / 2 || j == picture.length / 2 + counter / 2) {
                    System.out.print("X  ");
                } else {
                    System.out.print("   ");
                }
            }
            if (i != 0 && i < delta / 2) {
                counter += 2;
            } else if (i >= picture.length - 1 - delta / 2 && i != picture.length - 1) {
                counter -= 2;
            }
            System.out.println();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

}
