package designPatterns.commandPattern;

import designPatterns.commandPattern.Commands.GarageHochCommand;
import designPatterns.commandPattern.Commands.GarageRunterCommand;
import designPatterns.commandPattern.Commands.LichtAnCommand;
import designPatterns.commandPattern.Commands.LichtAusCommand;
import designPatterns.commandPattern.Commands.StereoanlageAnschaltenCommand;
import designPatterns.commandPattern.Commands.StereoanlageAusschaltenCommand;
import designPatterns.commandPattern.Receiver.Garage;
import designPatterns.commandPattern.Receiver.Licht;
import designPatterns.commandPattern.Receiver.Stereoanlage;

public class RemoteFactory {
  public static Remote makeBasicRemote() {
    Remote remote = new Remote();

    Licht licht = new Licht();
    Garage garage = new Garage();
    Stereoanlage stereo = new Stereoanlage();

    LichtAnCommand lanc = new LichtAnCommand(licht);
    LichtAusCommand lauc = new LichtAusCommand(licht);
    remote.setKnopf(0, lanc, lauc);

    GarageHochCommand ghoc = new GarageHochCommand(garage);
    GarageRunterCommand gruc = new GarageRunterCommand(garage);
    remote.setKnopf(1, ghoc, gruc);

    StereoanlageAnschaltenCommand sanc = new StereoanlageAnschaltenCommand(stereo);
    StereoanlageAusschaltenCommand sauc = new StereoanlageAusschaltenCommand(stereo);
    remote.setKnopf(2, sanc, sauc);

    return remote;
  }
}
