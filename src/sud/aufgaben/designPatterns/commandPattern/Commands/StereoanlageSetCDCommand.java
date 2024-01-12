package designPatterns.commandPattern.Commands;

import designPatterns.commandPattern.Receiver.Stereoanlage;

public class StereoanlageSetCDCommand extends Command<Stereoanlage> {
  public StereoanlageSetCDCommand(Stereoanlage stereoanlage) {
    super(stereoanlage);
  }

  public void execute() {
    this.receiver.setCD();
  }
}
