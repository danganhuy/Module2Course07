import Exercise4.*;
import javafx.scene.paint.Color;

public class Exercise5 {
    // [Bài tập] triển khai interface 'Colorable' cho các lớp hình học
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Circle(5.1,"light green",false);
        shapes[1] = new Rectangle(8.5,2,"yellow",true);
        shapes[2] = new Square(6.3);
        shapes[3] = new Circle(4);
        shapes[4] = new Rectangle();
        shapes[5] = new Square(3.4,"Neon",true);

        System.out.println("=== Shapes ===");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

        System.out.println("=== How to color ===");
        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                System.out.println(shape.toString());
                ((Colorable) shape).howToColor();
            }
        }
    }
}
