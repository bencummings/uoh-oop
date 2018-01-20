import javax.swing.JButton;
import javax.swing.JTextField;

public class AdditionListener extends MathListener {

  public AdditionListener(JButton clearButton, JTextField inputField, JTextField outputField) {
    super(clearButton, inputField, outputField);
  }

  @Override
  protected void mathOperation() {
    outputField.setText(Integer.toString(Integer.parseInt(outputField.getText()) + Integer.parseInt(inputField.getText())));
  }

}