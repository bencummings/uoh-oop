public class Main {

  public static void main(String[] args) {
    Box smallBox = new Box(1);
    Box mediumBox = new Box(3);
    Box largeBox = new Box(5);

    smallBox.add(new Book("John Daly", "My Life In and Out of the Rough", 0.75));
    smallBox.add(new CD("Metallica", "Master of Puppets", 1986));

    mediumBox.add(smallBox);
    mediumBox.add(new Book("Hank Haney", "The Big Miss", 0.55));
    mediumBox.add(new CD("The Offspring", "Smash", 1994));

    largeBox.add(mediumBox);
    largeBox.add(new Book("Ben Hogan", "Five Lessons", 1.35));

    System.out.println(largeBox);
  }

}