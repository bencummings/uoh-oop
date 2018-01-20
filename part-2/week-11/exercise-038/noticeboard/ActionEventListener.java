package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ActionEventListener implements ActionListener {

  private JTextField source;
  private JLabel target;

  public ActionEventListener(JTextField source, JLabel target) {
    this.source = source;
    this.target = target;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    target.setText(source.getText());
    source.setText("");
  }

}