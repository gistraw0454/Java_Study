package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;

        int area = rectangle.calculateArea();

        int perimeter = rectangle.calulatePerimeter();

        boolean square = rectangle.isSquare();

        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(square);
    }
}
