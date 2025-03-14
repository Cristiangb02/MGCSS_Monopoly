package edu.uhu.monopoly;

public class GoCell extends Cell {
	private boolean available = true;

	public GoCell() {
		super.setName("Go");
		setAvailable(false, null);
	}

	public boolean playAction(String msg) {
		return available;
	}
	
	void setName(String name) {
	}
}
