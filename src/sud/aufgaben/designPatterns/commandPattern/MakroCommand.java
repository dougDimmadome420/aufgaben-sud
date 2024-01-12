package designPatterns.commandPattern;

import designPatterns.commandPattern.Commands.Command;
import designPatterns.commandPattern.Receiver.Receiver;

public class MakroCommand extends Command<Receiver> {
  public MakroCommand(Receiver rc) {
    super(rc);
  }

  public void execute() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'execute'");
  }

}
