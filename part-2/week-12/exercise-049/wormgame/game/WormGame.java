package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

  private int width;
  private int height;
  private Worm worm;
  private Random random;
  private Apple apple;
  private boolean continues;
  private Updatable updatable;

  public WormGame(int width, int height) {
    super(1000, null);
    this.width = width;
    this.height = height;
    worm = new Worm(width / 2, height / 2, Direction.DOWN);
    random = new Random();
    createApple();
    this.continues = true;
    addActionListener(this);
    setInitialDelay(2000);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (!continues) {
      return;
    }
    worm.move();
    if (worm.runsInto(apple)) {
      worm.grow();
      createApple();
    } else if (worm.runsIntoItself() || isOutsideBounds()) {
      continues = false;
    }
    updatable.update();
    setDelay(1000 / worm.getLength());
  }

  public boolean continues() {
    return continues;
  }

  private void createApple() {
    Apple nextApple;
    do {
      nextApple = new Apple(random.nextInt(width), random.nextInt(height));
    } while (worm.runsInto(nextApple));
    this.apple = nextApple;
  }

  public Apple getApple() {
    return apple;
  }

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }

  public Worm getWorm() {
    return worm;
  }

  private boolean isOutsideBounds() {
    int x = worm.getHead().getX();
    int y = worm.getHead().getY();
    return x < 0 || x >= width || y < 0 || y >= height;
  }

  public void setApple(Apple apple) {
    this.apple = apple;
  }

  public void setUpdatable(Updatable updatable) {
    this.updatable = updatable;
  }

  public void setWorm(Worm worm) {
    this.worm = worm;
  }

}