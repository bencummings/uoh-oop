package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

public class FilmComparator implements Comparator<Film> {

  private Map<Film, List<Rating>> films;

  public FilmComparator(Map<Film, List<Rating>> films) {
    this.films = films;
  }

  @Override
  public int compare(Film first, Film second) {
    return getAverage(second) - getAverage(first);
  }

  private int getAverage(Film film) {
    int total = 0;
    List<Rating> ratings = films.get(film);
    for (Rating rating : ratings) {
      total += rating.getValue();
    }
    return total / ratings.size();
  }

}