public class RegistrationPlate {

  private final String countryCode;
  private final String regoCode;

  public RegistrationPlate(String countryCode, String regoCode) {
    this.countryCode = countryCode;
    this.regoCode = regoCode;
  }

  public String getCountry() {
    return countryCode;
  }

  public String getRego() {
    return regoCode;
  }

  @Override
  public boolean equals(Object object) {
    if (object != null && object instanceof RegistrationPlate) {
      RegistrationPlate converted = (RegistrationPlate) object;
      if (countryCode.equals(converted.getCountry()) && regoCode.equals(converted.getRego())) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int hashCode() {
    return countryCode.hashCode() + regoCode.hashCode();
  }

  @Override
  public String toString() {
    return countryCode + " " + regoCode;
  }

}