package dungeon;

public abstract class Character {

  private char symbol;
  private int x;
  private int y;

  public Character(char symbol, int x, int y) {
    this.symbol = symbol;
    this.x = x;
    this.y = y;
  }

  public char getSymbol() {
    return symbol;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return symbol + " " + x + " " + y;
  }

}