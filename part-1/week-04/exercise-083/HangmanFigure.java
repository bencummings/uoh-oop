import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;

public class HangmanFigure extends JPanel {

  private HangmanLogic logic;
  private HangmanUserInterface userInterface;

  HangmanFigure(HangmanLogic logic, HangmanUserInterface ui) {
    super();
    setBackground(Color.WHITE);
    this.logic = logic;
    this.userInterface = ui;
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    paintHangman(graphics);
    userInterface.repaint();
  }

  private void paintHangman(Graphics graphics) {
    int incorrectGuesses = logic.numberOfFaults();
    int baseY = 200;

    if (incorrectGuesses > 0) {
      graphics.drawLine(90, baseY, 200, baseY);
    }
    if (incorrectGuesses > 1) {
      graphics.drawLine(125, baseY, 125, baseY - 100);
    }
    if (incorrectGuesses > 2) {
      graphics.drawLine(110, baseY, 125, baseY - 15);
    }
    if (incorrectGuesses > 3) {
      graphics.drawLine(140, baseY, 125, baseY - 15);
    }
    if (incorrectGuesses > 4) {
      graphics.drawLine(125, baseY - 100, 175, baseY - 100);
    }
    if (incorrectGuesses > 5) {
      graphics.drawLine(125, baseY - 85, 140, baseY - 100);
    }
    if (incorrectGuesses > 6) {
      graphics.drawLine(175, baseY - 100, 175, baseY - 75);
    }
    if (incorrectGuesses > 7) {
      graphics.drawOval(170, baseY - 75, 10, 12);
    }
    if (incorrectGuesses > 8) {
      graphics.drawOval(170, baseY - 65, 15, 25);
    }
    if (incorrectGuesses > 9) {
      graphics.drawLine(160, baseY - 65, 170, baseY - 60);
    }
    if (incorrectGuesses > 10) {
      graphics.drawLine(183, baseY - 60, 193, baseY - 65);
    }
    if (incorrectGuesses > 11) {
      graphics.drawLine(165, baseY - 30, 170, baseY - 45);
    }
    if (incorrectGuesses > 12) {
      graphics.drawLine(183, baseY - 45, 193, baseY - 30);
    }

    graphics.drawString("Word: " + logic.hiddenWord(), 20, 250);
    graphics.drawString("Incorrect Guesses: " + incorrectGuesses, 20, 270);
    graphics.drawString("Game Status: " + updateGameStatus(), 20, 290);
    drawString(graphics, "Guessed Letters: " + logic.guessedLetters(), 20, 310, 240);
  }

  public String updateGameStatus() {
    String hiddenWord = logic.hiddenWord();
    if (!hiddenWord.contains("_")) {
      return "You Won!";
    }

    if (logic.numberOfFaults() > logic.losingFaultAmount()) {
      return "You Lost!";
    }

    return "In Progress...";
  }

  public void drawString(Graphics graphics, String string, int x, int y, int width) {
    FontMetrics fontMetrics = graphics.getFontMetrics();
    int lineHeight = fontMetrics.getHeight();
    int curX = x;
    int curY = y;
    String[] words = string.split(" ");
    for (String word : words) {
      int wordWidth = fontMetrics.stringWidth(word + " ");
      if (curX + wordWidth >= x + width) {
        curY += lineHeight;
        curX = x;
      }
      graphics.drawString(word, curX, curY);
      curX += wordWidth;
    }
  }

}