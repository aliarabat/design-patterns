package com.dp.decorator;

public class Sumatra extends Boisson {
	
	public Sumatra() {
		this.description="Sumatra";
	}
	@Override
	public double count() {
		return 8;
	}

}
