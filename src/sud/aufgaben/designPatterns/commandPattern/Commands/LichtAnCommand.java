package designPatterns.commandPattern.Commands;

import designPatterns.commandPattern.Receiver.Licht;

public class LichtAnCommand extends Command<Licht> {

  public LichtAnCommand(Licht licht) {
    super(licht);
  }

  public void execute() {
    this.receiver.setLichtAn();
  }
}
