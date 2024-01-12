package designPatterns.commandPattern.Commands;

import designPatterns.commandPattern.Receiver.Stereoanlage;

public class StereoanlageStoppePlaybackCommand extends Command<Stereoanlage> {
  public StereoanlageStoppePlaybackCommand(Stereoanlage stereoanlage) {
    super(stereoanlage);
  }

  public void execute() {
    this.receiver.stoppePlayback();
  }
}
