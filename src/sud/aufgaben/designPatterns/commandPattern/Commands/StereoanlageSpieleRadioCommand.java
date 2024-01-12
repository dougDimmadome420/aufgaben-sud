package designPatterns.commandPattern.Commands;

import designPatterns.commandPattern.Receiver.Stereoanlage;

public class StereoanlageSpieleRadioCommand extends Command<Stereoanlage> {
  public StereoanlageSpieleRadioCommand(Stereoanlage stereoanlage) {
    super(stereoanlage);
  }

  public void execute() {
    this.receiver.spieleRadio();
  }
}
