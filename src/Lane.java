import javafx.scene.paint.Color;

public class Lane {
    double x, y, width, height;
    Direction direction;
    boolean isInbound; // true: geliş yolu, false: gidiş yolu
    int[] carsOnLane;
    boolean doesHaveCar;

    public Lane(double x, double y, double width, double height, Direction direction, boolean isInbound) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.direction = direction;
        this.isInbound = isInbound;
    }
    public void carSpawner(int carInput, boolean doesHaveCar){
        double carNum = 0;
            if(doesHaveCar == false ){
                 carNum = Math.random()*10;
            }
            else{
                 carNum = carInput;
            }
            while((int)carNum >0){
                VehicleDrawing.drawVehicle(40,20, Color.color(Math.random(),Math.random(),Math.random()));
            }
    }
}
