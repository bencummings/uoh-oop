import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {

  private JFrame frame;

  @Override
  public void run() {
    frame = new JFrame("Calculator");
    frame.setMinimumSize(new Dimension(400, 200));
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setLayout(new GridLayout(3, 1));
    createComponents(frame.getContentPane());
    frame.pack();
    frame.setVisible(true);
  }

  private void createComponents(Container container) {
    JTextField outputField = new JTextField();
    JTextField inputField = new JTextField();
    JPanel panel = new JPanel(new GridLayout(1, 3));
    JButton addButton = new JButton("+");
    JButton subButton = new JButton("-");
    JButton clearButton = new JButton("Z");
    outputField.setEnabled(false);
    addButton.addActionListener(new AdditionListener(clearButton, inputField, outputField));
    subButton.addActionListener(new SubtractionListener(clearButton, inputField, outputField));
    clearButton.addActionListener(new ClearListener(clearButton, inputField, outputField));
    panel.add(addButton);
    panel.add(subButton);
    panel.add(clearButton);
    container.add(outputField);
    container.add(inputField);
    container.add(panel);
  }

  public JFrame getFrame() {
    return frame;
  }

}