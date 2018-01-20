package movingfigure;

import java.awt.Graphics;

public class Square extends Figure {

  private int length;

  public Square(int x, int y, int length) {
    super(x, y);
    this.length = length;
  }

  @Override
  public void draw(Graphics graphics) {
    graphics.fillRect(x, y, length, length);
  }

}