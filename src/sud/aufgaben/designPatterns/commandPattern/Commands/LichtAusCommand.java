package designPatterns.commandPattern.Commands;

import designPatterns.commandPattern.Receiver.Licht;

public class LichtAusCommand extends Command<Licht> {
  public LichtAusCommand(Licht licht) {
    super(licht);
  }

  public void execute() {
    this.receiver.setLichtAus();
  }
}
