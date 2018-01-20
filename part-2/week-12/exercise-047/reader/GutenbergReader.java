package reader;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import reader.criteria.Criterion;

public class GutenbergReader {

  private List<String> lines;

  public GutenbergReader(String address) {
    lines = new ArrayList<String>();
    try {
      URL url = new URL(address);
      Scanner reader = new Scanner(url.openStream());
      while (reader.hasNextLine()) {
        lines.add(reader.nextLine());
      }
    } catch (Exception e) {
      throw new IllegalArgumentException(e);
    }
  }

  public List<String> linesWhichComplyWith(Criterion criterion) {
    List<String> filtered = new ArrayList<String>();
    for (String line : lines) {
      if (criterion.complies(line)) {
        filtered.add(line);
      }
    }
    return filtered;
  }

}