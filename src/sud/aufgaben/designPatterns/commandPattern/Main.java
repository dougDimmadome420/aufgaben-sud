package designPatterns.commandPattern;

public class Main {
  public static void main(String[] args) {
    Remote r = RemoteFactory.makeBasicRemote();

    r.pressOnButton(0);
  }
}
