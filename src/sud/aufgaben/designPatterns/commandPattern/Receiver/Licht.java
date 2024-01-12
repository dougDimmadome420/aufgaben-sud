package designPatterns.commandPattern.Receiver;

public class Licht extends Receiver {

	boolean licht = false;

	public void setLichtAn() {
		licht = true;
		System.out.println("Licht An!");
	}

	public void setLichtAus() {
		licht = false;
		System.out.println("Licht Aus!");
	}

}
