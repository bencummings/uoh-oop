import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {

  private Map<Bird, List<String>> observations;

  public RingingCentre() {
    observations = new HashMap<Bird, List<String>>();
  }

  public void observe(Bird bird, String location) {
    if (!observations.containsKey(bird)) {
      observations.put(bird, new ArrayList<String>());
    }

    if (!observations.get(bird).contains(location)) {
      observations.get(bird).add(location);
    }
  }

  public void observations(Bird bird) {
    if (observations.containsKey(bird)) {
      List<String> locations = observations.get(bird);
      System.out.println(bird + " observations: " + locations.size());
      for (String location : locations) {
        System.out.println(location);
      }
    } else {
      System.out.println(bird + " observations: 0");
    }
  }

}