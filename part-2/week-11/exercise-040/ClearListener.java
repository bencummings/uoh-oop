import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ClearListener extends CalculatorListener {

  public ClearListener(JButton clearButton, JTextField inputField, JTextField outputField) {
    super(clearButton, inputField, outputField);
    clearAll();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    clearAll();
  }

  private void clearAll() {
    clearInput();
    clearOutput();
    toggleClearButton();
  }

}