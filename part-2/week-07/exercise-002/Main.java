public class Main {
  
  public static void main(String[] args) {
    Changer changer = new Changer();
    
    changer.addChange(new Change('a', 'o'));
    changer.addChange(new Change('p', 'b'));
    
    System.out.println(changer.change("The ape stole the apple from the octopus!"));
  }
  
}