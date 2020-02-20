package com.dp.decorator;

public abstract class Boisson {
	protected String description;

	public abstract double count();

	public String getDescription() {
		return description;
	}

}
