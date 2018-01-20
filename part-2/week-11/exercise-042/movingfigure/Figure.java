package movingfigure;

import java.awt.Graphics;

public abstract class Figure {

  protected int x;
  protected int y;

  public Figure(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public abstract void draw(Graphics graphics);

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void move(int x, int y) {
    this.x += x;
    this.y += y;
  }

}