import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {
  private List<T> elements = new ArrayList<>();

  public void renderLayer() {
    for (Mappable element : elements) {
      element.render();
    }
  }

  public void addElement(T element) {
    elements.add(element);
  }
}
