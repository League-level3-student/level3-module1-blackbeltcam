package _01_IntroToArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class _05_LongChipCompetition {
	/**
	 * The Beatles are eating lunch and playing a game to see who has the longest
	 * chip. (In England, french fries are called "chips".) * Find the Beatle with
	 * the longest chip. You may not edit the Chip or Beatle classes. Make sure to
	 * initialize The Beatles before you start your search. *
	 **/
	private ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();

	public static void main(String[] args) {
		_05_LongChipCompetition lcc = new _05_LongChipCompetition();
		lcc.initializeBeatles();
		lcc.findtheChip();

	}

	public void findtheChip() {
		double longestchip = 0.0;
		String haslongchip = " ";

		for (int i = 0; i < theBeatles.size(); i++) {
			Beatle c = theBeatles.get(i);
			ArrayList<Chip> cl = c.getChips();
			for (int z = 0; z < cl.size(); z++) {
				double chiplength = cl.get(z).getLength();
				if (chiplength > longestchip) {
					longestchip = chiplength;
					haslongchip = c.getName();
				}
			}
		}
		System.out.println(haslongchip + " has the longest chip with a length of " + longestchip);

	}
	// ArrayList<String> s = c.getChips();
	// for (int j = 0; j < s.size(); j++) {
	// s.get(j);
	// if (s.get(j) == "diamond") {

	// String yournamehere = c.getName();
	// System.out.println(
	// yournamehere + " had the diamond \n" + deadcrows + " Crow(s) died in the
	// procces.");
	// break;
	// }
	// }
	// }
	//
	// }
	//

	//
	// int longestchip = 0;
	// for (int i = 0; i < getTheBand().size(); i++) {
	// theBeatles.get(i);
	// if (chip > longestchip) {
	// chip = longestchip;
	// }
	// }
	// }

	private void initializeBeatles() {
		Beatle george = new Beatle("George");
		Beatle john = new Beatle("John");
		Beatle paul = new Beatle("Paul");
		Beatle ringo = new Beatle("Ringo");
		theBeatles.add(george);
		theBeatles.add(john);
		theBeatles.add(paul);
		theBeatles.add(ringo);
	}

	public ArrayList<Beatle> getTheBand() {
		return theBeatles;
	}
}

class Beatle {
	private String name;
	private ArrayList<Chip> chips = new ArrayList<Chip>();

	public Beatle(String name) {
		this.name = name;
		initializePlateOfChips();
	}

	private void initializePlateOfChips() {
		int numberOfChips = new Random().nextInt(100);
		for (int i = 0; i < numberOfChips; i++) {
			chips.add(new Chip(new Random().nextDouble() * 10));
		}
	}

	public ArrayList<Chip> getChips() {
		return this.chips;
	}

	public String getName() {
		return this.name;
	}
}

class Chip {
	private double length;

	public double getLength() {
		return length;
	}

	Chip(double d) {
		this.length = d;
	}
}
