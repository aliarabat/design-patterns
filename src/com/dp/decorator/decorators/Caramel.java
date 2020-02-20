package com.dp.decorator.decorators;

import com.dp.decorator.Boisson;

public class Caramel extends AbstractDecorator {

	public Caramel(Boisson boisson) {
		super(boisson);
	}

	@Override
	public double count() {
		return 0.9 + boisson.count();
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + " au Caramel";
	}

}
