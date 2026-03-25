package com.hensandducks.test;

public class Farm {
	
	private Hen[] hens;
	private Duck[] ducks;
	private int totalEggs;

	public Hen[] getHens() {
		return hens;
	}

	public void setHens(Hen[] hens) {
		this.hens = hens;
	}

	public Duck[] getDucks() {
		return ducks;
	}

	public void setDucks(Duck[] ducks) {
		this.ducks = ducks;
	}
	
	public int calculateTotalEggs() {
		for(Hen hen : hens) {
			totalEggs = totalEggs + hen.getTotalEggs();
		}
		for(Duck duck : ducks) {
			totalEggs = totalEggs + duck.getTotalEggs();
		}
		return totalEggs;
	}
	
	
}
