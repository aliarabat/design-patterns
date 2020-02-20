package com.dp.decorator.decorators;

import com.dp.decorator.Boisson;

public class Chocolat extends AbstractDecorator {

	public Chocolat(Boisson boisson) {
		super(boisson);
	}

	@Override
	public double count() {
		return 0.7 + boisson.count();
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + " au Chocolat";
	}

}
