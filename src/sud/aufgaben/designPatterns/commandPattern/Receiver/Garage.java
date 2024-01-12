package designPatterns.commandPattern.Receiver;

public class Garage extends Receiver {

	private boolean hoch;

	public boolean isHoch() {
		return hoch;
	}

	public void hoch() {
		System.out.println("Garagentor faehrt hoch");
		this.hoch = true;
	}

	public void runter() {
		System.out.println("Garagentor faehrt runter");
		this.hoch = false;
	}

}
