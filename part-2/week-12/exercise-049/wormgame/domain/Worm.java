package wormgame.domain;

import java.util.ArrayList;
import java.util.List;
import wormgame.Direction;

public class Worm {

  private int x;
  private int y;
  private Direction direction;
  private int length;
  private List<Piece> pieces;

  public Worm(int x, int y, Direction direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
    length = 3; // Initially set to the "maturity" length.
    pieces = new ArrayList<Piece>();
    addPiece();
  }

  private void addPiece() {
    pieces.add(new Piece(x, y));
  }

  private void deletePiece() {
    pieces.remove(0);
  }

  public Direction getDirection() {
    return direction;
  }

  public Piece getHead() {
    return pieces.get(pieces.size() - 1);
  }

  public int getLength() {
    return pieces.size();
  }

  public List<Piece> getPieces() {
    return pieces;
  }

  public void grow() {
    if (pieces.size() == length) {
      length++;
    }
  }

  public void move() {
    updateLocation();
    addPiece();
    if (pieces.size() > length) {
      deletePiece();
    }
  }

  public boolean runsInto(Piece other) {
    for (Piece piece : pieces) {
      if (piece.equals(other)) {
        continue;
      }
      if (piece.runsInto(other)) {
        return true;
      }
    }
    return false;
  }

  public boolean runsIntoItself() {
    return runsInto(pieces.get(pieces.size() - 1));
  }

  public void setDirection(Direction direction) {
    this.direction = direction;
  }

  private void updateLocation() {
    switch (direction) {
      case UP:
        y--;
        break;
      case DOWN:
        y++;
        break;
      case LEFT:
        x--;
        break;
      case RIGHT:
        x++;
        break;
    }
  }

}