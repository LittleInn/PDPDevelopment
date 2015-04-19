package com.pdp.reflection.development.logger;

public class Cart {
	private int prev;
	private int current;

	public Cart(int prev, int current) {
		this.prev = prev;
		this.current = current;
	}

	public int getPrev() {
		return prev;
	}

	public void setPrev(int prev) {
		this.prev = prev;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

}
