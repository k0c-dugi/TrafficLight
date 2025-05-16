public class Lane {
    double x, y, width, height;
    Direction direction;
    boolean isInbound; // true: geliş yolu, false: gidiş yolu

    public Lane(double x, double y, double width, double height, Direction direction, boolean isInbound) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.direction = direction;
        this.isInbound = isInbound;
    }
}
