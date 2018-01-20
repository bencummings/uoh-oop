import java.util.Random;

public class PasswordRandomizer {

  private int length;
  private Random random;

  public PasswordRandomizer(int length) {
    this.length = length;
    random = new Random();
  }

  public String createPassword() {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    String password = "";
    for (int i = 0; i < length; i++) {
      password += alphabet.charAt(random.nextInt(alphabet.length()));
    }
    return password;
  }

}