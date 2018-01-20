import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public abstract class CalculatorListener implements ActionListener {

  private JButton clearButton;
  protected JTextField inputField;
  protected JTextField outputField;

  public CalculatorListener(JButton clearButton, JTextField inputField, JTextField outputField) {
    this.clearButton = clearButton;
    this.inputField = inputField;
    this.outputField = outputField;
  }

  @Override
  public abstract void actionPerformed(ActionEvent e);

  protected void clearInput() {
    inputField.setText("");
  }

  protected void clearOutput() {
    outputField.setText(Integer.toString(0));
  }

  protected void toggleClearButton() {
    if (Integer.parseInt(outputField.getText()) == 0) {
      clearButton.setEnabled(false);
    } else {
      clearButton.setEnabled(true);
    }
  }

}