import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Type a word:");
    String result = " ";
    if (!palindrome(reader.nextLine())) {
      result += "not ";
    }
    System.out.println("The text is" + result + "a palindrome!");
  }

  public static boolean palindrome(String word) {
    for (int i = 0; i < word.length(); i++) {
      if (i >= word.length() - 1 - i) {
        break;
      }
      if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }

}