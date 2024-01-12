package designPatterns.commandPattern.Commands;

import designPatterns.commandPattern.Receiver.Stereoanlage;

public class StereoanlageAnschaltenCommand extends Command<Stereoanlage> {
  public StereoanlageAnschaltenCommand(Stereoanlage stereoanlage) {
    super(stereoanlage);
  }

  public void execute() {
    this.receiver.anschalten();
  }
}
