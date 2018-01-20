package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {

  public PersonalBoard(int width, int height) {
    super(width, height);
  }

  @Override
  public void initiateRandomCells(double probability) {
    Random random = new Random();
    for (int i = 0; i < getWidth(); i++) {
      for (int j = 0; j < getHeight(); j++) {
        getBoard()[i][j] = random.nextDouble() >= (1 - probability);
      }
    }
  }

  @Override
  public boolean isAlive(int x, int y) {
    if (validCoordinates(x, y)) {
      return getBoard()[x][y];
    }
    return false;
  }

  @Override
  public void turnToLiving(int x, int y) {
    if (validCoordinates(x, y)) {
      getBoard()[x][y] = true;
    }
  }

  @Override
  public void turnToDead(int x, int y) {
    if (validCoordinates(x, y)) {
      getBoard()[x][y] = false;
    }
  }

  @Override
  public int getNumberOfLivingNeighbours(int x, int y) {
    int neighbours = 0;
    for (int i = x - 1; i <= x + 1; i++) {
      for (int j = y - 1; j <= y + 1; j++) {
        if (validCoordinates(i, j) && (i != x || j != y) && getBoard()[i][j]) {
          neighbours++;
        }
      }
    }
    return neighbours;
  }

  @Override
  public void manageCell(int x, int y, int neighbours) {
    if (isAlive(x, y)) {
      if (neighbours != 2 && neighbours != 3) {
        turnToDead(x, y);
      }
    } else {
      if (neighbours == 3) {
        turnToLiving(x, y);
      }
    }
  }

  private boolean validCoordinates(int x, int y) {
    return (x >= 0 && x < getWidth()) && (y >= 0 && y < getHeight());
  }

}