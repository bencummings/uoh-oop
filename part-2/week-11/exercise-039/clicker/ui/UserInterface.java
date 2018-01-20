package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

  private Calculator calculator;
  private JFrame frame;

  public UserInterface(Calculator calculator) {
    this.calculator = calculator;
  }

  @Override
  public void run() {
    frame = new JFrame("Click Effect");
    frame.setPreferredSize(new Dimension(200, 100));
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    createComponents(frame.getContentPane());
    frame.pack();
    frame.setVisible(true);
  }

  private void createComponents(Container container) {
    JLabel label = new JLabel(Integer.toString(calculator.giveValue()));
    JButton button = new JButton("Click!");
    button.addActionListener(new ClickListener(calculator, label));
    container.add(label, BorderLayout.NORTH);
    container.add(button, BorderLayout.SOUTH);
  }

  public JFrame getFrame() {
    return frame;
  }

}