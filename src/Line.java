import java.util.ArrayList;
import java.util.List;

abstract class Line implements Mappable {
  private List<List<Double>> points = new ArrayList<>();

  public void addPoint(double x, double y) {
    List<Double> point = new ArrayList<>(2);
    point.add(x);
    point.add(y);
    points.add(point);
  }

  public List<List<Double>> getPoints() {
    return points;
  }
}
