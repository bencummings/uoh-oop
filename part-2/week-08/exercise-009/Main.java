public class Main {

  public static void main(String[] args) {
    VehicleRegister register = new VehicleRegister();

    register.add(new RegistrationPlate("AU", "ABC-123"), "Ben");
    register.add(new RegistrationPlate("AU", "XYZ-123"), "Amy");
    register.add(new RegistrationPlate("AU", "XYZ-123"), "Ben");

    printPlates(register);
    printOwners(register);

    register.delete(new RegistrationPlate("AU", "XYZ-123"));
    register.add(new RegistrationPlate("AU", "XYZ-123"), "Ben");

    printPlates(register);
    printOwners(register);
  }

  private static void printPlates(VehicleRegister register) {
    System.out.println();
    System.out.println("Unique Registration Plates:");
    register.printRegistrationPlates();
  }

  private static void printOwners(VehicleRegister register) {
    System.out.println();
    System.out.println("Unique Owners:");
    register.printOwners();
  }

}