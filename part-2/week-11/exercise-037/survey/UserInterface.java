package survey;

import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

  private JFrame frame;

  @Override
  public void run() {
    frame = new JFrame("Survey");
    frame.setMinimumSize(new Dimension(200, 300));
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
    frame.getContentPane().add(new JLabel("Are you?"));
    frame.getContentPane().add(new JCheckBox("Yes!"));
    frame.getContentPane().add(new JCheckBox("No!"));
    frame.getContentPane().add(new JLabel("Why?"));
    ButtonGroup bg = new ButtonGroup();
    bg.add((AbstractButton) frame.getContentPane().add(new JRadioButton("No reason.")));
    bg.add((AbstractButton) frame.getContentPane().add(new JRadioButton("Because it is fun!")));
    frame.getContentPane().add(new JButton("Done!"));
    frame.pack();
    frame.setVisible(true);
  }

  public JFrame getFrame() {
    return frame;
  }

}