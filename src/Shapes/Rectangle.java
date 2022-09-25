package Shapes;

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

}
