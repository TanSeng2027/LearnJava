import java.awt.*;

public class Main {
    public static void main(String[] args) {
        shape[] shapes = {new Rectangle(3,4), new Circle(2.5)};
        for (shape s: shapes) {
            System.out.println(s.toString());
        }
    }
}