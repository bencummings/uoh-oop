public class Person {

  private String name;
  private int age;
  private int height;
  private int weight;

  public Person(String name, int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public void becomeOlder() {
    age++;
  }

  public boolean adult() {
    return age > 18;
  }

  public double weightIndex() {
    return weight / Math.pow(height / 100.0, 2);
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return name + " I am " + age + " years old, my weight index is " + weightIndex();
  }

}