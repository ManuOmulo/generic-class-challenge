import java.util.List;

public class Layer<T extends Mappable> {
  private List<T> elements;

  public Layer(List<T> elements) {
    this.elements = elements;
  }

  public void renderLayer() {
    for (Mappable element : elements) {
      element.render();
    }
  }

  public void addElement(T element) {
    elements.add(element);
  }
}
