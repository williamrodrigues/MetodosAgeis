package edu.utfpr.maffetone;

public class Maffetone {

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

	public static Maffetone calcZonaMaffetone(int idade) {
		Maffetone maffetone = new Maffetone();

		maffetone.setMax(180 - idade);
		maffetone.setMin(maffetone.getMax() - 10);

		return maffetone;
	}

	public static Maffetone calcZonaMaffetoneA(int idade) {
		Maffetone maffetone = new Maffetone();

		maffetone.setMax(180 - idade - 10);
		maffetone.setMin(maffetone.getMax() - 10);

		return maffetone;
	}

	public static Maffetone calcZonaMaffetoneB(int idade) {
		Maffetone maffetone = new Maffetone();

		maffetone.setMax(180 - idade - 5);
		maffetone.setMin(maffetone.getMax() - 10);

		return maffetone;
	}
}
