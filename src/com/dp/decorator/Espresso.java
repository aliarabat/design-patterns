package com.dp.decorator;

public class Espresso extends Boisson {
	
	public Espresso() {
		this.description="Espresso";
	}
	@Override
	public double count() {
		return 6;
	}

}
