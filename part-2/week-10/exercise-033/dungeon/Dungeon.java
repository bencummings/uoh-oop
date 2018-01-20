package dungeon;

import java.util.Random;
import java.util.Scanner;

public class Dungeon {

  private int gridWidth;
  private int gridHeight;
  private Character[][] gridLocations;
  private Character[] characters;
  private int moveCount;
  private boolean dynamicVampires;
  private Random random;

  public Dungeon(int gridWidth, int gridHeight, int vampireCount, int moveCount, boolean dynamicVampires) throws IllegalArgumentException {
    if (vampireCount >= (gridWidth * gridHeight)) {
      throw new IllegalArgumentException("The grid size was insufficient.");
    }

    if (vampireCount > moveCount) {
      throw new IllegalArgumentException("The allocated amount of moves was insufficient.");
    }

    this.gridWidth = gridWidth;
    this.gridHeight = gridHeight;
    gridLocations = new Character[gridHeight][gridWidth];
    characters = new Character[vampireCount + 1];
    this.moveCount = moveCount;
    this.dynamicVampires = dynamicVampires;
    random = new Random();

    addPlayer();
    addVampires(vampireCount);
  }

  private void addPlayer() {
    characters[0] = new Player();
    gridLocations[0][0] = characters[0];
  }

  private void addVampires(int amount) {
    for (int i = 0; i < amount; i++) {
      int x;
      int y;
      while (true) {
        x = random.nextInt(gridWidth);
        y = random.nextInt(gridHeight);
        if (gridLocations[y][x] == null) {
          characters[i + 1] = new Vampire(x, y);
          gridLocations[y][x] = characters[i + 1];
          break;
        }
      }
    }
  }

  private Character[] copyCharacters() {
    Character[] copiedCharacters = new Character[characters.length];
    for (int i = 0; i < characters.length; i++) {
      copiedCharacters[i] = characters[i];
    }
    return copiedCharacters;
  }

  private boolean findCharacter(Character character) {
    for (int i = 0; i < characters.length; i++) {
      if (characters[i] == character) {
        return true;
      }
    }
    return false;
  }

  private boolean gameOver() {
    return moveCount == 0 || getVampireCount() == 0;
  }

  private int getVampireCount() {
    return characters.length - 1;
  }

  private void modifyLocation(Character character, int x, int y) {
    gridLocations[y][x] = character;
    gridLocations[character.getY()][character.getX()] = null;
    character.setLocation(x, y);
  }

  private void moveCharacters(String commands) {
    Character[] copiedCharacters = copyCharacters();
    for (Character character : copiedCharacters) {
      if (findCharacter(character)) {
        if (character instanceof Player) {
          movePlayer(character, commands);
        } else if (character instanceof Vampire && dynamicVampires) {
          moveVampire(character, commands.length());
        }
      }
    }
    moveCount--;
  }

  private void movePlayer(Character character, String commands) {
    int x = character.getX();
    int y = character.getY();
    for (int i = 0; i < commands.length(); i++) {
      switch (commands.charAt(i)) {
        case 'w':
          if (validLocation(x, y - 1)) {
            y--;
          }
          break;
        case 'a':
          if (validLocation(x - 1, y)) {
            x--;
          }
          break;
        case 's':
          if (validLocation(x, y + 1)) {
            y++;
          }
          break;
        case 'd':
          if (validLocation(x + 1, y)) {
            x++;
          }
          break;
      }
    }
    if (updatedLocation(character.getX(), character.getY(), x, y)) {
      if (gridLocations[y][x] != null) {
        removeCharacter(gridLocations[y][x]);
      }
      modifyLocation(character, x, y);
    }
  }

  private void moveVampire(Character character, int steps) {
    for (int i = 0; i < steps; i++) {
      int x;
      int y;
      do {
        x = random.nextInt(3) + (character.getX() - 1);
        if (x == character.getX()) {
          y = random.nextInt(3) + (character.getY() - 1);
        } else {
          y = character.getY();
        }
      } while (!validLocation(x, y) || !updatedLocation(character.getX(), character.getY(), x, y));
      if (gridLocations[y][x] == null) {
        modifyLocation(character, x, y);
      }
    }
  }

  private void printCharacters() {
    for (Character character : characters) {
      System.out.println(character);
    }
  }

  private void printGrid() {
    String output = "";
    for (int i = 0; i < gridHeight; i++) {
      for (int j = 0; j < gridWidth; j++) {
        if (gridLocations[i][j] != null) {
          output += gridLocations[i][j].getSymbol();
        } else {
          output += ".";
        }
      }
      output += "\n";
    }
    System.out.print(output);
  }

  private void printMoveCount() {
    System.out.println(moveCount);
  }

  private void printOutcome() {
    if (getVampireCount() == 0) {
      System.out.println("YOU WIN!");
    } else {
      System.out.println("YOU LOSE!");
    }
  }

  private String processCommands(String commands) {
    commands = commands.toLowerCase();
    String output = "";
    for (int i = 0; i < commands.length(); i++) {
      switch (commands.charAt(i)) {
        case 'w':
        case 'a':
        case 's':
        case 'd':
          output += commands.charAt(i);
      }
    }
    return output;
  }

  private void removeCharacter(Character character) {
    Character[] updatedCharacters = new Character[characters.length - 1];
    int count = 0;
    for (int i = 0; i < characters.length; i++) {
      if (characters[i] != character) {
        updatedCharacters[count] = characters[i];
        count++;
      }
    }
    characters = updatedCharacters;
  }

  public void run() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      printMoveCount();
      System.out.println();

      printCharacters();
      System.out.println();

      printGrid();
      System.out.println();

      String commands = processCommands(scanner.nextLine());

      moveCharacters(commands);

      if (gameOver()) {
        break;
      }
    }

    printOutcome();
  }

  private boolean updatedLocation(int previousX, int previousY, int newX, int newY) {
    return (previousX != newX) || (previousY != newY);
  }

  private boolean validLocation(int x, int y) {
    return ((x >= 0) && (x < gridWidth)) && ((y >= 0) && (y < gridHeight));
  }

}