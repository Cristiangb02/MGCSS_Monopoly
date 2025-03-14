package edu.uhu.monopoly;

public abstract class Cell implements IOwnable {
	private String name;
	protected Player proprietary;
	private boolean available = true;

	public String getName() {
		return name;
	}

	@Override
	public Player getProprietary() {
		return proprietary;
	}
	
	public int getPrice() {
		return 0;
	}

	public abstract boolean playAction(String msg);

	void setName(String name) {
		this.name = name;
	}

	@Override
	public void setProprietary(Player owner) {
		this.proprietary = owner;
	}
    
    public String toString() {
        return name;
    }

	@Override
	public void setAvailable(boolean available, CardCell cardCell) {
		this.available = available;
	}

	@Override
	public boolean isAvailable() {
		return available;
	}
}
