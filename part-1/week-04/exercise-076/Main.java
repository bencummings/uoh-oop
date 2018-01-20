public class Main {

  public static void main(String[] args) {
    Menu winterMenu = new Menu();
    winterMenu.addMeal("Chicken Noodle Soup");
    winterMenu.addMeal("Mac and Cheese");
    winterMenu.addMeal("Turkey Meatballs");
    winterMenu.printMeals();
    System.out.println();
    winterMenu.clearMenu();
    winterMenu.addMeal("Cottage Pie");
    winterMenu.printMeals();
    System.out.println();
  }

}