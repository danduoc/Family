package GiaDinh;

import java.util.ArrayList;

public class Family {
	private String nameF;
	private String status;
	private String add;
	private ArrayList<People> p;

	public Family() {
		super();
	}

	public Family(String status, String add, ArrayList<People> p) {
		super();
		nameF = p.get(0).getName();
		this.status = status;
		this.add = add;
		this.p = p;
	}

	public String getNameF() {
		return nameF;
	}

	public void setNameF(String nameF) {
		this.nameF = nameF;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public ArrayList<People> getP() {
		return p;
	}

	public void setP(ArrayList<People> p) {
		this.p = p;
	}

	public void display() {
		System.out.println("householder's name: " + nameF);
		System.out.println("Number Member: " + p.size());
		System.out.println("Address: " + add);
		System.out.println("Status: " + status);
		System.out.println("List Information Member");
		for (int i = 0; i < p.size(); i++) {
			p.get(i).display();
		}
	}

	public static ArrayList<Family> getPoorHousehold(ArrayList<Family> fa) {
		ArrayList<Family> v = new ArrayList<>();
		for (int i = 0; i < fa.size(); i++) {
			if (fa.get(i).getStatus().equals("poor")) {
				v.add(fa.get(i));
			}
		}
		return v;
	}

	public static ArrayList<Family> findFamilySurename(ArrayList<Family> fa, String surename) {
		ArrayList<Family> v = new ArrayList<>();
		for (int i = 0; i < fa.size(); i++) {
			if (fa.get(i).getNameF().equals(surename)) {
				v.add(fa.get(i));
			}
		}
		return v;
	}
}