

import javafx.scene.paint.Color;
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
    }

    @Override
    public void turnRight() {
        direction = direction.turnRight();
    }

    @Override
    public void stop() {

    }
}
