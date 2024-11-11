import Exercise4.*;

public class Exercise4 {
    // [Bài tập ] Triển khai interface 'Resizeable' cho các lớp hình học
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Circle(5.1,"light green",false);
        shapes[1] = new Rectangle(8.5,2,"yellow",true);
        shapes[2] = new Square(6.3);
        shapes[3] = new Circle(4);
        shapes[4] = new Rectangle();
        shapes[5] = new Square(3.4,"Neon",true);

        System.out.println("=== Shapes before resize ===");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

        ((Resizable) shapes[0]).resize(.5);
        ((Resizable) shapes[1]).resize(.95);
        ((Resizable) shapes[2]).resize(.72);
        ((Resizable) shapes[3]).resize(.31);
        ((Resizable) shapes[4]).resize(.48);
        ((Resizable) shapes[5]).resize(.82);

        System.out.println("=== Shapes after resize ===");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
