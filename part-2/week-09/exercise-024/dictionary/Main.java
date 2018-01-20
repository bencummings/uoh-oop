package dictionary;

public class Main {

  public static void main(String[] args) {
    PersonalMultipleEntryDictionary golfSlang = new PersonalMultipleEntryDictionary();

    golfSlang.add("hook", "snappy tom");
    golfSlang.add("shank", "hosel rocket");
    golfSlang.add("shank", "jailhouse");

    System.out.println(golfSlang.translate("hook"));
    System.out.println(golfSlang.translate("shank"));
    System.out.println(golfSlang.translate("slice"));
  }

}