package designPatterns.commandPattern;

import designPatterns.commandPattern.Commands.Command;
import designPatterns.commandPattern.Receiver.Receiver;

public class Invoker {
  private Command<Receiver> command;

  public Invoker() {
    
  }

  public void setCommand(Command<Receiver> command) {
    this.command = command;
  }
}
