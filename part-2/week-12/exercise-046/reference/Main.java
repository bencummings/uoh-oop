package reference;

import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class Main {

  public static void main(String[] args) {
    RatingRegister register = new RatingRegister();

    Film caddyShack = new Film("Caddy Shack");
    Film happyGilmore = new Film("Happy Gilmore");
    Film theNotebook = new Film("The Notebook");

    Person amy = new Person("Amy");
    Person angela = new Person("Angela");
    Person ben = new Person("Ben");
    Person luke = new Person("Luke");

    register.addRating(amy, caddyShack, Rating.BAD);
    register.addRating(amy, happyGilmore, Rating.BAD);
    register.addRating(amy, theNotebook, Rating.GOOD);
    register.addRating(angela, caddyShack, Rating.MEDIOCRE);
    register.addRating(ben, caddyShack, Rating.GOOD);
    register.addRating(ben, happyGilmore, Rating.GOOD);
    register.addRating(ben, theNotebook, Rating.BAD);
    register.addRating(luke, caddyShack, Rating.FINE);

    Reference reference = new Reference(register);

    System.out.println("Film recommendation for " + angela + ": " + reference.recommendFilm(angela));
    System.out.println("Film recommendation for " + luke + ": " + reference.recommendFilm(luke));
  }

}