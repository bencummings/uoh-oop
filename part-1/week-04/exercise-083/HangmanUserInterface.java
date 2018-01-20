import java.awt.HeadlessException;
import javax.swing.JFrame;

public class HangmanUserInterface extends JFrame {

  private HangmanFigure figure;

  public HangmanUserInterface(HangmanLogic logic) throws HeadlessException {
    super();
    setTitle("Hangman");
    figure = new HangmanFigure(logic, this);
    add(figure);
    addKeyListener(new HangmanKeyAdapter(logic));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 400);
  }

  @Override
  public void repaint() {
    super.repaint();
    figure.repaint();
  }

  public void start() {
    setVisible(true);
  }

}