package GiaDinh;

import java.util.ArrayList;

public class Group {
	private String nameGr;
	private ArrayList<Family> f;

	public Group() {
		super();
	}

	public Group(String nameGr, ArrayList<Family> f) {
		super();
		this.nameGr = nameGr;
		this.f = f;
	}

	public String getNameGr() {
		return nameGr;
	}

	public void setNameGr(String nameGr) {
		this.nameGr = nameGr;
	}

	public ArrayList<Family> getF() {
		return f;
	}

	public void setF(ArrayList<Family> f) {
		this.f = f;
	}

	public int getNumberFamily() {
		return f.size();
	}

	public void display() {
		System.out.println("Name Group: " + nameGr);
		System.out.println("Number Family: " + f.size());
		for (Family family : f) {
			family.display();
		}
	}

	public static double avgAgeGroup(Group v) {
		ArrayList<Family> F = new ArrayList<>(v.getF());
		double sum = 0;
		int n = 0;
		for (Family family : F) {
			ArrayList<People> P = new ArrayList<>(family.getP());
			n += P.size();
			for (People person : P) {
				sum += person.getAge();
			}
		}
		return sum / n;
	}

	public static ArrayList<People> getPeopleHaveNotJob(Group g) {
		ArrayList<People> v = new ArrayList<>();
		ArrayList<Family> listF = new ArrayList<>(g.getF());
		for (Family family : listF) {
			ArrayList<People> P = new ArrayList<>(family.getP());
			for (People person : P) {
				if (person.getJob().equals("")) {
					v.add(person);
				}
			}
		}
		return v;
	}
}
