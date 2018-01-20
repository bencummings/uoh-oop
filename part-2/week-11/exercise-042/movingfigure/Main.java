package movingfigure;

import javax.swing.SwingUtilities;

public class Main {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new UserInterface(new Square(20, 20, 100)));
  }

}