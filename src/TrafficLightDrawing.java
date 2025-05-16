import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class TrafficLightDrawing {

    public Pane drawTrafficLight(double x, double y) {
        Pane lightPane = new Pane();

        // Siyah arka plan (lamba kutusu)
        Rectangle box = new Rectangle(x, y, 30, 90);
        box.setFill(Color.BLACK);
        lightPane.getChildren().add(box);

        // Kırmızı ışık
        Circle red = new Circle(x + 15, y + 15, 10);
        red.setFill(Color.RED);

        // Sarı ışık
        Circle yellow = new Circle(x + 15, y + 45, 10);
        yellow.setFill(Color.DARKGOLDENROD);

        // Yeşil ışık
        Circle green = new Circle(x + 15, y + 75, 10);
        green.setFill(Color.DARKGREEN);

        lightPane.getChildren().addAll(red, yellow, green);
        return lightPane;
    }
}
