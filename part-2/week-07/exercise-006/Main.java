public class Main {

  public static void main(String[] args) {
    PromissoryNote myNote = new PromissoryNote();

    myNote.setLoan("Amy", 50.75);

    System.out.println(myNote.howMuchIsTheDebt("Amy"));
    System.out.println(myNote.howMuchIsTheDebt("Luke"));
  }

}