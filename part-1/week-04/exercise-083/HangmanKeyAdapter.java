import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class HangmanKeyAdapter extends KeyAdapter {

  private HangmanLogic logic;

  public HangmanKeyAdapter(HangmanLogic logic) {
    this.logic = logic;
  }

  @Override
  public void keyPressed(KeyEvent ke) {
    if (logic.numberOfFaults() > logic.losingFaultAmount()) {
      return;
    }

    String hiddenWord = logic.hiddenWord();
    if (!hiddenWord.contains("_")) {
      return;
    }

    super.keyPressed(ke);
    String key = String.valueOf(ke.getKeyChar()).toUpperCase();
    logic.guessLetter(key);
  }

}