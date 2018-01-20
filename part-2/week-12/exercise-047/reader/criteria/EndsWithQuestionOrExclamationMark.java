package reader.criteria;

public class EndsWithQuestionOrExclamationMark implements Criterion {

  @Override
  public boolean complies(String line) {
    if (line.length() > 0) {
      char last = line.charAt(line.length() - 1);
      return last == '?' || last == '!';
    }
    return false;
  }

}