package designPatterns.commandPattern.Receiver;

public class PopcornMaschine extends Receiver {
	String beschreibung;

	public PopcornMaschine(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public void ein() {
		System.out.println(beschreibung + " an");
	}

	public void aus() {
		System.out.println(beschreibung + " aus");
	}

	public void starten() {
		System.out.println(beschreibung + " mache Popcorn!");
	}

	public String toString() {
		return beschreibung;
	}
}
