package designPatterns.commandPattern.Commands;

import designPatterns.commandPattern.Receiver.Stereoanlage;

public class StereoanlageAusschaltenCommand extends Command<Stereoanlage> {
  public StereoanlageAusschaltenCommand(Stereoanlage stereoanlage) {
    super(stereoanlage);
  }

  public void execute() {
    this.receiver.ausschalten();
  }
}
