import java.util.ArrayList;
import java.util.Scanner;

public class Airport {

  private ArrayList<Airplane> airplanes;
  private ArrayList<Flight> flights;
  private Scanner scanner;

  public Airport() {
    airplanes = new ArrayList<Airplane>();
    flights = new ArrayList<Flight>();
    scanner = new Scanner(System.in);
  }

  private void addAirplane(String id, int capacity) {
    airplanes.add(new Airplane(id, capacity));
  }

  private void printAirplanes() {
    for (Airplane airplane : airplanes) {
      System.out.println(airplane);
    }
  }

  private Airplane searchAirplanes(String id) {
    for (Airplane airplane : airplanes) {
      if (airplane.getId().equalsIgnoreCase(id)) {
        return airplane;
      }
    }
    return null;
  }

  private boolean uniqueAirplane(String id) {
    for (Airplane airplane : airplanes) {
      if (airplane.getId().equalsIgnoreCase(id)) {
        return false;
      }
    }
    return true;
  }

  private void addFlight(Airplane airplane, String origin, String destination) {
    flights.add(new Flight(airplane, origin, destination));
  }

  private void printFlights() {
    for (Flight flight : flights) {
      System.out.println(flight);
    }
  }

  public void maintenancePanel() {
    System.out.println();
    System.out.println("Airport panel");
    System.out.println("-------------");
    while (true) {
      System.out.println();
      System.out.println("Choose operation:");
      System.out.println("[1] Add airplane");
      System.out.println("[2] Add flight");
      System.out.println("[x] Exit");
      System.out.print("> ");
      String operation = scanner.nextLine();
      if (operation.equalsIgnoreCase("x")) {
        break;
      } else if (operation.equals("1")) {
        System.out.print("Give plane ID: ");
        String id = scanner.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());
        if (uniqueAirplane(id)) {
          addAirplane(id, capacity);
        }
      } else if (operation.equals("2")) {
        System.out.print("Give plane ID: ");
        Airplane airplane = searchAirplanes(scanner.nextLine());
        System.out.print("Give departure airport code: ");
        String origin = scanner.nextLine();
        System.out.print("Give destination airport code: ");
        String destination = scanner.nextLine();
        if (airplane != null) {
          addFlight(airplane, origin, destination);
        }
      }
    }
  }

  public void statusPanel() {
    System.out.println();
    System.out.println("Flight service");
    System.out.println("--------------");
    while (true) {
      System.out.println();
      System.out.println("Choose operation:");
      System.out.println("[1] Print planes");
      System.out.println("[2] Print flights");
      System.out.println("[3] Print plane info");
      System.out.println("[x] Quit");
      System.out.print("> ");
      String operation = scanner.nextLine();
      if (operation.equalsIgnoreCase("x")) {
        break;
      } else if (operation.equals("1")) {
        printAirplanes();
      } else if (operation.equals("2")) {
        printFlights();
      } else if (operation.equals("3")) {
        System.out.print("Give plane ID: ");
        Airplane airplane = searchAirplanes(scanner.nextLine());
        if (airplane != null) {
          System.out.println(airplane);
        }
      }
    }
  }

}