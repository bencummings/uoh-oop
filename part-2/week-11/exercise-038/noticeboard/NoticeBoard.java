package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

  private JFrame frame;

  @Override
  public void run() {
    frame = new JFrame("Text Copier");
    frame.setMinimumSize(new Dimension(400, 200));
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setLayout(new GridLayout(3, 1));
    createComponents(frame.getContentPane());
    frame.pack();
    frame.setVisible(true);
  }

  private void createComponents(Container container) {
    JTextField input = new JTextField();
    JLabel output = new JLabel();
    JButton button = new JButton("Copy!");
    button.addActionListener(new ActionEventListener(input, output));
    container.add(input);
    container.add(button);
    container.add(output);
  }

}