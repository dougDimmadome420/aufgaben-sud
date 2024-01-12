package designPatterns.commandPattern.Commands;

import designPatterns.commandPattern.Receiver.Stereoanlage;

public class StereoanlageSpieleCDAbCommand extends Command<Stereoanlage> {
  public StereoanlageSpieleCDAbCommand(Stereoanlage stereoanlage) {
    super(stereoanlage);
  }

  public void execute() {
    this.receiver.spieleCDAb();
  }
}
