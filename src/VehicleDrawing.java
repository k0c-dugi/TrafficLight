import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


public class VehicleDrawing {

    public Pane drawVehicle(double x, double y, Color color) {
        Pane vehiclePane = new Pane();

        // Araç gövdesi (basit dikdörtgen)
        Rectangle body = new Rectangle(x, y, 70, 35); // 40 genişlik, 20 yükseklik
        body.setFill(color);
        body.setArcWidth(10);  // köşeleri hafif yuvarlak
        body.setArcHeight(10);

        vehiclePane.getChildren().add(body);
        return vehiclePane;
    }

}
