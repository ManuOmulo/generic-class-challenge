import java.util.ArrayList;
import java.util.List;

public class River extends Line {
  private String name;
  private List<List<Double>> riverPoints = new ArrayList<>();

  public River(String name) {
    this.name = name;
  }

  public void addPoint(double latitude, double longitude) {
    List<Double> point = new ArrayList<>();
    point.add(latitude);
    point.add(longitude);
    riverPoints.add(point);
  }

  public List<List<Double>> getRiverPoints() {
    return riverPoints;
  }

  @Override
  public void render() {
    System.out.printf("Render %s as %s (%s)\n", name, super.getClass().getSuperclass().getSimpleName(), getRiverPoints());
  }
}
