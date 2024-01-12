package designPatterns.commandPattern.Commands;

import designPatterns.commandPattern.Receiver.Garage;

public class GarageHochCommand extends Command<Garage> {
  public GarageHochCommand(Garage garage) {
    super(garage);
  }

  public void execute() {
    this.receiver.hoch();
  }
}
