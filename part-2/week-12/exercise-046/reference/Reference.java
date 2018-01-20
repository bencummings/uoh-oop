package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class Reference {

  private RatingRegister register;

  public Reference(RatingRegister register) {
    this.register = register;
  }

  private Map<Film, List<Rating>> convertMapValues(Map<Film, Rating> films) {
    Map<Film, List<Rating>> converted = new HashMap<Film, List<Rating>>();
    for (Film film : films.keySet()) {
      converted.put(film, new ArrayList<Rating>());
      converted.get(film).add(films.get(film));
    }
    return converted;
  }

  private List<Film> filterFilms(Map<Film, Rating> films) {
    List<Film> filtered = new ArrayList<Film>();
    for (Film film : films.keySet()) {
      if (films.get(film).getValue() >= Rating.FINE.getValue()) {
        filtered.add(film);
      }
    }
    return filtered;
  }

  private int generateScore(Person first, Person second, Film film) {
    return register.getRating(first, film).getValue() * register.getRating(second, film).getValue();
  }

  public Film recommendFilm(Person person) {
    List<Film> films;
    FilmComparator comparator;
    if (register.getPersonalRatings(person).isEmpty() || register.reviewers().size() == 1) {
      films = new ArrayList<Film>(register.filmRatings().keySet());
      comparator = new FilmComparator(register.filmRatings());
    } else {
      Person recommender = recommendPerson(person);
      films = filterFilms(register.getPersonalRatings(recommender));
      comparator = new FilmComparator(convertMapValues(register.getPersonalRatings(recommender)));
    }
    Collections.sort(films, comparator);
    for (Film film : films) {
      if (register.getRating(person, film) == Rating.NOT_WATCHED) {
        return film;
      }
    }
    return null;
  }

  private Person recommendPerson(Person person) {
    Map<Person, Integer> scores = new HashMap<Person, Integer>();
    List<Film> watched = new ArrayList<Film>(register.getPersonalRatings(person).keySet());
    List<Person> reviewers = register.reviewers();
    for (Film film : watched) {
      for (Person reviewer : reviewers) {
        if (reviewer.equals(person)) {
          continue;
        }
        if (register.getRating(reviewer, film) != Rating.NOT_WATCHED) {
          if (!scores.containsKey(reviewer)) {
            scores.put(reviewer, generateScore(person, reviewer, film));
          } else {
            scores.put(reviewer, scores.get(reviewer) + generateScore(person, reviewer, film));
          }
        }
      }
    }
    List<Person> filtered = new ArrayList<Person>(scores.keySet());
    Collections.sort(filtered, new PersonComparator(scores));
    return filtered.get(0);
  }

}