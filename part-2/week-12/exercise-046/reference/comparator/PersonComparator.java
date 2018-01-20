package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.Person;

public class PersonComparator implements Comparator<Person> {

  private Map<Person, Integer> identities;

  public PersonComparator(Map<Person, Integer> identities) {
    this.identities = identities;
  }

  @Override
  public int compare(Person first, Person second) {
    return identities.get(second) - identities.get(first);
  }

}