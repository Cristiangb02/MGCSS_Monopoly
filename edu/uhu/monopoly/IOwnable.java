package edu.uhu.monopoly;

public interface IOwnable {

	Player getProprietary();

	void setProprietary(Player owner);

	void setAvailable(boolean available, CardCell cardCell);

	boolean isAvailable();

}