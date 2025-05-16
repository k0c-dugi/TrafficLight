import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class RoadDrawing {

    private List<Lane> lanes = new ArrayList<>();

    public List<Lane> getLanes() {
        return lanes;
    }

    public Pane drawRoad() {
        Pane root = new Pane();

        // Ana yol (gri arka plan)
        Rectangle road = new Rectangle(0, 0, 800, 800);
        road.setFill(Color.GRAY);
        root.getChildren().add(road);

        // Orta kavşak alanı
        Rectangle intersection = new Rectangle(300, 300, 200, 200);
        intersection.setFill(Color.LIGHTGRAY);
        root.getChildren().add(intersection);

        // Orta şerit çizgisi (yatay)
        Line horizontalLane = new Line(0, 400, 800, 400);
        horizontalLane.setStroke(Color.WHITE);
        horizontalLane.setStrokeWidth(3);
        horizontalLane.getStrokeDashArray().addAll(20.0, 20.0);
        root.getChildren().add(horizontalLane);

        // Orta şerit çizgisi (dikey)
        Line verticalLane = new Line(400, 0, 400, 800);
        verticalLane.setStroke(Color.WHITE);
        verticalLane.setStrokeWidth(3);
        verticalLane.getStrokeDashArray().addAll(20.0, 20.0);
        root.getChildren().add(verticalLane);

        // Yol kenarları
        drawRoadEdges(root);


        lanes.add(new Lane(300, 0, 100, 300, Direction.NORTH, false)); // Kuzey gidiş
        lanes.add(new Lane(400, 0, 100, 300, Direction.NORTH, true));  // Kuzey geliş
        lanes.add(new Lane(300, 500, 100, 300, Direction.SOUTH, true)); // Güney geliş
        lanes.add(new Lane(400, 500, 100, 300, Direction.SOUTH,  false)); // Güney gidiş
        lanes.add(new Lane(0, 300, 300, 100, Direction.WEST, false)); // Batıdan doğuya gidiş
        lanes.add(new Lane(0, 400, 300, 100, Direction.WEST, true));  // Batıdan doğuya geliş
        lanes.add(new Lane(500, 300, 300, 100, Direction.EAST, true)); // Doğudan batıya geliş
        lanes.add(new Lane(500, 400, 300, 100, Direction.EAST, false)); // Doğudan batıya gidiş


        for (Lane lane : lanes) {
            Rectangle laneRect = new Rectangle(lane.x, lane.y, lane.width, lane.height);

            // Test için renklendirme
            if (lane.direction == Direction.NORTH && !lane.isInbound) {
                laneRect.setFill(Color.HOTPINK); // Kuzeyden gelen gidiş (gidiş: false)
            } else if (lane.direction == Direction.NORTH && lane.isInbound) {
                laneRect.setFill(Color.LIGHTGREEN); // Kuzey geliş
            } else if (lane.direction == Direction.SOUTH && !lane.isInbound) {
                laneRect.setFill(Color.ORANGE);
            } else if (lane.direction == Direction.SOUTH && lane.isInbound) {
                laneRect.setFill(Color.LIGHTBLUE);
            } else if (lane.direction == Direction.EAST && !lane.isInbound) {
                laneRect.setFill(Color.YELLOW);
            } else if (lane.direction == Direction.EAST && lane.isInbound) {
                laneRect.setFill(Color.DEEPPINK);
            } else if (lane.direction == Direction.WEST && !lane.isInbound) {
                laneRect.setFill(Color.PURPLE);
            } else if (lane.direction == Direction.WEST && lane.isInbound) {
                laneRect.setFill(Color.BROWN);
            }
            laneRect.setOpacity(0.6); // Alttaki yol görünmeye devam etsin
            root.getChildren().add(laneRect);
        }


        return root;
    }

    private void drawRoadEdges(Pane root) {
        Line topEdge = new Line(0, 300, 800, 300);
        Line bottomEdge = new Line(0, 500, 800, 500);
        Line leftEdge = new Line(300, 0, 300, 800);
        Line rightEdge = new Line(500, 0, 500, 800);

        for (Line edge : new Line[]{topEdge, bottomEdge, leftEdge, rightEdge}) {
            edge.setStroke(Color.WHITE);
            edge.setStrokeWidth(5);
            root.getChildren().add(edge);
        }
    }
}
