import java.util.ArrayList;

public class Library {

  private ArrayList<Book> books;

  public Library() {
    books = new ArrayList<Book>();
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public void printBooks() {
    for (Book book : books) {
      System.out.println(book);
    }
  }

  private ArrayList<Book> search(String query, String property) {
    ArrayList<Book> filteredBooks = new ArrayList<Book>();
    for (Book book : books) {
      String bookProperty;
      if (property.equalsIgnoreCase("title")) {
        bookProperty = book.title();
      } else if (property.equalsIgnoreCase("publisher")) {
        bookProperty = book.publisher();
      } else {
        bookProperty = Integer.toString(book.year());
      }
      if (StringUtils.included(bookProperty, query)) {
        filteredBooks.add(book);
      }
    }
    return filteredBooks;
  }

  public ArrayList<Book> searchByTitle(String title) {
    return search(title, "title");
  }

  public ArrayList<Book> searchByPublisher(String publisher) {
    return search(publisher, "publisher");
  }

  public ArrayList<Book> searchByYear(int year) {
    return search(Integer.toString(year), "year");
  }

}