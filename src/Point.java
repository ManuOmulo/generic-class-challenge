import java.util.ArrayList;
import java.util.List;

abstract class Point implements Mappable {
  private double x;
  private double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public List<Double> getPoints() {
    List<Double> points = new ArrayList<>(2);
    points.add(x);
    points.add(y);
    return points;
  }
}
