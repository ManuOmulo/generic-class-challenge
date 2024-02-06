public class Park extends Point {
  private String name;
  private double latitude;
  private double longitude;

  public Park(String name, double latitude, double longitude) {
    super(latitude, longitude);
    this.name = name;
  }

  @Override
  public void render() {
    System.out.printf("Render %s as %s (%s)\n", name, super.getClass().getSuperclass().getSimpleName(), super.getPoints());
  }
}
