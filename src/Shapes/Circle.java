package Shapes;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    void draw() {
        String[][] picture = new String[this.radius * 2][this.radius * 2];
        int radius = this.radius % 2 == 0 ? this.radius : this.radius - 1;
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length; j++) {
                if (i == 0 || i == picture.length - 1) {
                    if (j > radius / 2 && j < radius + radius / 2) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i > radius / 2 && i < radius + radius / 2) {
                    if (j == 0 || j == picture[i].length - 1) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i == j || i + j == radius / 2 + radius) {
//                     || j == radius / 2 + radius + i - 1 || j == i - radius - 1 || j == i
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
