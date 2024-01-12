package designPatterns.commandPattern;

import java.util.ArrayList;

import designPatterns.commandPattern.Commands.Command;
import designPatterns.commandPattern.Receiver.Receiver;

public class Remote {
  private ArrayList<Command<Receiver>> onButtons = new ArrayList<>();
  private ArrayList<Command<Receiver>> offButtons = new ArrayList<>();

  public Remote() {
    for (int i = 0; i < 7; i++) {
      onButtons.add(null);
      offButtons.add(null);
    }
  }

  public void setKnopf(int pos, Command<Receiver> onCommand, Command<Receiver> offCommand) {
    this.onButtons.set(pos, onCommand);
    this.offButtons.set(pos, offCommand);
  }

  public void pressOnButton(int pos) {
    this.onButtons.get(pos).execute();
  }

  public void pressOffButton(int pos) {
    this.offButtons.get(pos).execute();
  }
}
