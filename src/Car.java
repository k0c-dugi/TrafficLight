

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Car implements Vehicle {

    Direction direction;
    Color color;
    Location location;
    Direction directionTo;
    Direction directionFrom;

    @Override
    public void move() {
        //Bu metotta, aracın baktığı yöndeki düzlemde ilerleme yapmasını sağlayacağız
    }

    @Override
    public void turnLeft() {
        //Bu metotta, aracın directionTo ve directionFrom değerleri uyuşmuyorsa ve yol
        //ortasında ise dönmesini sağlayacağız. Bu esnada muhtemelen directionFrom değişkeni
        //güncellenecek
        direction = direction.turnLeft();
        move();
    }

    @Override
    public void turnRight() {

        direction = direction.turnRight();
        move();
    }

    @Override
    public void stop() {

    }
}
