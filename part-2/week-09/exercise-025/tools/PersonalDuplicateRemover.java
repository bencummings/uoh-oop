package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

  private int duplicateCount;
  private Set<String> words;

  public PersonalDuplicateRemover() {
    empty();
  }

  @Override
  public void empty() {
    duplicateCount = 0;
    words = new HashSet<String>();
  }

  @Override
  public void add(String word) {
    if (words.contains(word)) {
      duplicateCount++;
    } else {
      words.add(word);
    }
  }

  @Override
  public int getNumberOfDetectedDuplicates() {
    return duplicateCount;
  }

  @Override
  public Set<String> getUniqueCharacterStrings() {
    return words;
  }

}