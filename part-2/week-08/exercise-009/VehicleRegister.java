import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class VehicleRegister {

  private HashMap<RegistrationPlate, String> owners;

  public VehicleRegister() {
    owners = new HashMap<RegistrationPlate, String>();
  }

  public boolean add(RegistrationPlate plate, String owner) {
    if (get(plate) == null) {
      owners.put(plate, owner);
      return true;
    }
    return false;
  }

  public boolean delete(RegistrationPlate plate) {
    if (owners.containsKey(plate)) {
      owners.remove(plate);
      return true;
    }
    return false;
  }

  public String get(RegistrationPlate plate) {
    if (owners.containsKey(plate)) {
      return owners.get(plate);
    }
    return null;
  }

  public void printRegistrationPlates() {
    for (RegistrationPlate plate : owners.keySet()) {
      System.out.println(plate);
    }
  }

  public void printOwners() {
    for (String owner : removeDuplicates(owners.values())) {
      System.out.println(owner);
    }
  }

  private ArrayList<String> removeDuplicates(Collection<String> collection) {
    ArrayList<String> filtered = new ArrayList<String>();
    for (String string : collection) {
      if (!filtered.contains(string)) {
        filtered.add(string);
      }
    }
    return filtered;
  }

}