public class Main {
  public static void main(String[] args) {
    Park grandCanyon = new Park("Grand Canyon", 36.0636, 112.1079);
    Park yellowStone = new Park("Yellowstone", 44.4882, 110.5916);

    River mississippi = new River("Mississippi River");
    mississippi.addPoint(47.2160, -95.2348);
    mississippi.addPoint(35.1556, -90.0659);
    mississippi.addPoint(29.1566, -89.2495);

    Layer<Park> parks = new Layer<>();
    parks.addElement(grandCanyon);
    parks.addElement(yellowStone);
    parks.renderLayer();

    Layer<River> rivers = new Layer<>();
    rivers.addElement(mississippi);
    rivers.renderLayer();
  }
}
