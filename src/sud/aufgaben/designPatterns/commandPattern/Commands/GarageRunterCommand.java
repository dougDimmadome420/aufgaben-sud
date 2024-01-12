package designPatterns.commandPattern.Commands;

import designPatterns.commandPattern.Receiver.Garage;

public class GarageRunterCommand extends Command<Garage> {
  public GarageRunterCommand(Garage garage) {
    super(garage);
  }

  public void execute() {
    this.receiver.runter();
  }
}
