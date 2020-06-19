package flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {

    private final PointIconFactory pointIconFactory;

    public PointService(PointIconFactory pointIconFactory) {
        this.pointIconFactory = pointIconFactory;
    }

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 2, pointIconFactory.getPointIcon(PointType.HOSPITAL)));
        points.add(new Point(3, 4, pointIconFactory.getPointIcon(PointType.CAFE)));
        points.add(new Point(5, 6, pointIconFactory.getPointIcon(PointType.RESTAURANT)));
        return points;
    }
}
