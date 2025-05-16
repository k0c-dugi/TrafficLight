import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        RoadDrawing roadDrawing = new RoadDrawing();
        Pane root = roadDrawing.drawRoad();

        TrafficLightDrawing trafficLight = new TrafficLightDrawing();
        Pane lightNorth = trafficLight.drawTrafficLight(0, 0);
        lightNorth.setRotate(180);
        lightNorth.setLayoutX(260);
        lightNorth.setLayoutY(150);
        root.getChildren().add(lightNorth);
        Pane lightSouth = trafficLight.drawTrafficLight(510, 600);
        root.getChildren().add(lightSouth);
        Pane lightWest = trafficLight.drawTrafficLight(0, 0);
        lightWest.setRotate(90);
        lightWest.setLayoutX(180);
        lightWest.setLayoutY(480);
        root.getChildren().add(lightWest);
        Pane lightEast = trafficLight.drawTrafficLight(0, 0);
        lightEast.setRotate(270);
        lightEast.setLayoutX(600);
        lightEast.setLayoutY(230);
        root.getChildren().add(lightEast);


        VehicleDrawing vehicle = new VehicleDrawing();
        Pane vehicle1 = vehicle.drawVehicle(0, 0, Color.BLUE);
        vehicle1.setRotate(90);
        vehicle1.setLayoutX(320);
        vehicle1.setLayoutY(100);
        root.getChildren().add(vehicle1);

        Pane vehicle2 = vehicle.drawVehicle(0, 0, Color.RED);
        vehicle2.setRotate(90);
        vehicle2.setLayoutX(320);
        vehicle2.setLayoutY(190);
        root.getChildren().add(vehicle2);


        Scene scene = new Scene(root, 800, 800);
        stage.setTitle("Akıllı Trafik Işıkları Sistemi");
        stage.setScene(scene);
        stage.show();

        for (Lane lane : roadDrawing.getLanes()) {
            System.out.println(lane.direction + " - " + (lane.isInbound ? "Geliş" : "Gidiş"));
        }
    }



    public static void main(String[] args) {
        launch();
    }
}
