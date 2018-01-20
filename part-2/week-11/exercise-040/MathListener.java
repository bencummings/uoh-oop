import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;

public abstract class MathListener extends CalculatorListener {

  public MathListener(JButton clearButton, JTextField inputField, JTextField outputField) {
    super(clearButton, inputField, outputField);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    try {
      mathOperation();
    } catch (NumberFormatException ex) {
      System.out.println("Error. The input value must be an integer.");
    } finally {
      clearInput();
      toggleClearButton();
    }
  }

  protected abstract void mathOperation();

}