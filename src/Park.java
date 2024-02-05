import java.util.ArrayList;
import java.util.List;

public class Park extends Point {
  private String name;
  private double latitude;
  private double longitude;

  public Park(String name, double latitude, double longitude) {
    this.name = name;
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public List<Double> getCoordinates() {
    List<Double> coordinates = new ArrayList<>();
    coordinates.add(latitude);
    coordinates.add(longitude);
    return coordinates;
  }

  @Override
  public void render() {
    System.out.printf("Render %s as %s (%s)\n", name, super.getClass().getSuperclass().getSimpleName(), getCoordinates());
  }
}
