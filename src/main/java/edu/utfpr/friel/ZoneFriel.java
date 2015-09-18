package edu.utfpr.friel;

public class ZoneFriel {

	private int min;
	private int max;

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public static ZoneFriel runEndurance(int lthr) {
		ZoneFriel friel = new ZoneFriel();

		friel.setMin(0);

		friel.setMax((int) (lthr * 0.85));

		return friel;
	}

	public static ZoneFriel runModerate(int lthr) {
		ZoneFriel friel = new ZoneFriel();

		friel.setMin((int) (lthr * 0.85));

		friel.setMax((int) (lthr * 0.89));

		return friel;
	}

	public static ZoneFriel runTempo(int lthr) {
		ZoneFriel friel = new ZoneFriel();

		friel.setMin((int) (lthr * 0.90));

		friel.setMax((int) (lthr * 0.94));

		return friel;
	}

	public static ZoneFriel runThreshold(int lthr) {
		ZoneFriel friel = new ZoneFriel();

		friel.setMin((int) (lthr * 0.95));

		friel.setMax((int) (lthr * 0.99));

		return friel;
	}

	public static ZoneFriel runAnaerobic(int lthr) {
		ZoneFriel friel = new ZoneFriel();

		friel.setMin((int) (lthr * 1));

		friel.setMax((int) (lthr * 1.02));

		return friel;
	}
	
	public static ZoneFriel runBreathless(int lthr) {
		ZoneFriel friel = new ZoneFriel();

		friel.setMin((int) (lthr * 1.03));

		friel.setMax((int) (lthr * 1.06));

		return friel;
	}
	
	public static ZoneFriel runWithTrouble(int lthr) {
		ZoneFriel friel = new ZoneFriel();

		friel.setMin((int) (lthr * 1.06) + 1);

		return friel;
	}
}
