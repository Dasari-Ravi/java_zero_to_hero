package com.java.core.Interface.challenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements Isaveble {
	private String name;
	private int highPionts;
	private int Strength;
	private String weapeon;

	public Player(String name, int highPionts, int strength) {
		super();
		this.name = name;
		this.highPionts = highPionts;
		this.Strength = strength;
		this.weapeon = "sword";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHighPionts() {
		return highPionts;
	}

	public void setHighPionts(int highPionts) {
		this.highPionts = highPionts;
	}

	public int getStrength() {
		return Strength;
	}

	public void setStrength(int strength) {
		Strength = strength;
	}

	public String getWeapeon() {
		return weapeon;
	}

	public void setWeapeon(String weapeon) {
		this.weapeon = weapeon;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", highPionts=" + highPionts + ", Strength=" + Strength + ", weapeon=" + weapeon
				+ "]";
	}

	@Override
	public ArrayList<String> write() {
		List<String> values = new ArrayList<String>();
		values.add(0, this.name);
		values.add(1, "" + this.highPionts);
		values.add(2, "" + this.Strength);
		values.add(3, "" + this.weapeon);

		return values;
	}

	@Override
	public void read(List<String> savedValues) {
		if (savedValues != null && savedValues.size() > 0) {
			this.name=savedValues.get(0);
			this.highPionts=Integer.parseInt(savedValues.get(1));
			this.Strength=Integer.parseInt(savedValues.get(2));
			this.weapeon=savedValues.get(3);

		}

	}

}
