import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Library library = new Library();

    library.addBook(new Book("Alice in Wonderland", "Macmillan", 1865));
    library.addBook(new Book("The Hobbit", "Allen & Unwin", 1937));
    library.addBook(new Book("The Lord of the Rings", "Allen & Unwin", 1954));

    System.out.println("The library contains the following books:");
    library.printBooks();
    System.out.println();

    System.out.print("Publisher search: ");
    String query = scanner.nextLine();

    System.out.println("Your search returned the following books:");
    for (Book book : library.searchByPublisher(query)) {
      System.out.println(book);
    }
    System.out.println();
  }

}