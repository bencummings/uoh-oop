package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class RatingRegister {

  private Map<Film, List<Rating>> films;
  private Map<Person, Map<Film, Rating>> reviewers;

  public RatingRegister() {
    films = new HashMap<Film, List<Rating>>();
    reviewers = new HashMap<Person, Map<Film, Rating>>();
  }

  public void addRating(Film film, Rating rating) {
    if (!films.containsKey(film)) {
      films.put(film, new ArrayList<Rating>());
    }
    films.get(film).add(rating);
  }

  public void addRating(Person person, Film film, Rating rating) {
    if (!reviewers.containsKey(person)) {
      reviewers.put(person, new HashMap<Film, Rating>());
    }

    if (!reviewers.get(person).containsKey(film)) {
      reviewers.get(person).put(film, rating);
      addRating(film, rating);
    }
  }

  public Map<Film, List<Rating>> filmRatings() {
    return films;
  }

  public Map<Film, Rating> getPersonalRatings(Person person) {
    if (reviewers.containsKey(person)) {
      return reviewers.get(person);
    }
    return new HashMap<Film, Rating>();
  }

  public Rating getRating(Person person, Film film) {
    if (reviewers.containsKey(person) && reviewers.get(person).containsKey(film)) {
      return reviewers.get(person).get(film);
    }
    return Rating.NOT_WATCHED;
  }

  public List<Rating> getRatings(Film film) {
    if (films.containsKey(film)) {
      return films.get(film);
    }
    return new ArrayList<Rating>();
  }

  public List<Person> reviewers() {
    return new ArrayList<Person>(reviewers.keySet());
  }

}