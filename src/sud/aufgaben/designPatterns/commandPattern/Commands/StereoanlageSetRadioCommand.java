package designPatterns.commandPattern.Commands;

import designPatterns.commandPattern.Receiver.Stereoanlage;

public class StereoanlageSetRadioCommand extends Command<Stereoanlage> {
  public StereoanlageSetRadioCommand(Stereoanlage stereoanlage) {
    super(stereoanlage);
  }

  public void execute() {
    this.receiver.setRadio();
  }
}
