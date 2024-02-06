public class River extends Line {
  private String name;

  public River(String name) {
    this.name = name;
  }

  public void addPoint(double latitude, double longitude) {
    super.addPoint(latitude, longitude);
  }

  @Override
  public void render() {
    System.out.printf("Render %s as %s (%s)\n", name, super.getClass().getSuperclass().getSimpleName(), super.getPoints());
  }
}
