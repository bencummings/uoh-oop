package greeter.ui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {

  private JFrame frame;

  @Override
  public void run() {
    frame = new JFrame("Swing on");
    frame.setMinimumSize(new Dimension(400, 200));
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    createComponents(frame.getContentPane());
    frame.pack();
    frame.setVisible(true);
  }

  private void createComponents(Container container) {
    container.add(new JLabel("Hi!"));
  }

  public JFrame getFrame() {
    return frame;
  }

}